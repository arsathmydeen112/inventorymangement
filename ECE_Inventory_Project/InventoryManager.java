package ECE_Inventory_Project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class InventoryManager {
    private static final String FILE_NAME = "inventory.txt";
    public static void main(String[]args)
    {
        ArrayList<Component> inventory = new ArrayList<>();
        loadFromFile(inventory);
        Scanner in = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- ECE Lab Inventory System(Saved) ---");

        while(running)
        {
            System.out.println("\n1. Add a Componenet");
            System.out.println("2. View All Components");
            System.out.println("3. Search for a Component");
            System.out.println("4. Remove a Componenet");
            System.out.println("5. Exit");
            System.out.println("Choose an option (1-5): ");
            
            int choice = in.nextInt();
            in.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter component name (e.g., 10k Ohm Resistor): ");
                    String name = in.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = in.nextInt();

                    inventory.add(new Component(name,qty));
                    saveToFile(inventory);
                    System.out.println("Component added successfully!");
                    break;
                
                case 2:
                    System.out.println("\n--- Current Lab Inventory ---");
                    if(inventory.isEmpty())
                    {
                        System.out.println("The lab is currently empty.");
                    }
                    else
                    {
                        for(Component c: inventory)
                        {
                            c.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter component name to search for: ");
                    String searchName = in.nextLine();
                    boolean found = false;

                    for(Component c: inventory)
                    {
                        if(c.getName().equalsIgnoreCase(searchName))
                        {
                            System.out.println("---Component Found---");
                            c.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Error: "+searchName+" is not in stock.");
                    }

                    case 4:
                        System.out.print("Enter the exact name of the component you used/want to remove: ");
                        String removeName = in.nextLine();
                        boolean removed = false;

                        for(int i=0;i<inventory.size();i--)
                        {
                            if(inventory.get(i).getName().equalsIgnoreCase(removeName))
                            {
                                inventory.remove(i);
                                System.out.println(removeName+" has been successfully removed from the lab.");
                                removed = true;
                                saveToFile(inventory);
                                break;
                            }
                        }
                        if(!removed)
                        {
                            System.out.println("Could not find "+removeName+"to remove. Check your spelling.");
                            break;
                        }

                case 5:
                    running = false;
                    System.out.println("Thank you for manage our system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
        in.close();

        

    }
    public static void saveToFile(ArrayList<Component> list) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Component c : list) {
                writer.println(c.toFileFormat());
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
    public static void loadFromFile(ArrayList<Component> list) {
        File file = new File(FILE_NAME);
        if (!file.exists()) return; // If no file yet, just start fresh

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(","); // Split "Resistor,50" into two parts
                if (parts.length == 2) {
                    list.add(new Component(parts[0], Integer.parseInt(parts[1])));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file.");
        }
    }
}
