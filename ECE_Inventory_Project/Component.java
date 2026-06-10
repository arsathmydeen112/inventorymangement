package ECE_Inventory_Project;

public class Component {
    private String name;
    private int quantity;

    public Component(String name,int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void displayInfo()
    {
        System.out.println("Name: "+name+ " | Quantity: "+quantity);
    }
    public String toFileFormat()
    {
        return name+ "," +quantity;
    }
}
