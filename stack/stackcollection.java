package stack;
import java.util.*;
public class stackcollection {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            Stack<Integer> stack = new Stack<>();
            System.out.println("Enter the number of elements to push: ");
            int n = in.nextInt();

            System.out.println("Enter the stack elements : ");
            for(int i=0;i<n;i++)
            {
                int val = in.nextInt();
                stack.push(val);
            }

            System.out.println("Stack : "+stack);
            //peek
            System.out.println("Top element : "+stack.peek());
            //pop
            System.out.println("Removed element : "+stack.pop());
            //stack after pop
            System.out.println("stack after pop : "+stack);
            //check empty
            System.out.println("stack is empty? : "+stack.isEmpty());
            in.close();
        }
    }
}
