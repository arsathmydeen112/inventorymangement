package stack;
import java.util.*;
public class stackstring {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Enter your String : ");
            String s = in.nextLine();

            int n = s.length();
            char stack[] = new char[n];
            int top = -1;
            for(int i=0;i<n;i++)
            {
                stack[++top] = s.charAt(i);
            }
            System.out.print("Reversed String : ");
            while(top!=-1)
            {
                System.out.print(stack[top--]);
            }
            in.close();
        }
    }
    
}
