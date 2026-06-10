package stack;
import java.util.Scanner;
public class stack {
    
    int max;
    int top;
    int stack1[];

    stack(int size)
    {
        max = size;
        stack1 = new int[max];
        top = -1;
    }

    void push(int value)
    {
        if(top == max-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stack1[++top] = value;
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Popped element: "+stack1[top--]);
        }
    }

    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("Stack elements : ");
            for(int i=top;i>=0;i--)
            {
                System.out.print(stack1[i]+" ");
            }
        }
        System.out.println();
    }
    void count()
    {
        if(top==-1)
        {
              System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("No of element's in the stack "+ (top+1));
        }
    }
    void peek()
    {
        if(top==-1)
        {
              System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("Peek element is : "+stack1[top]);
        }
    }


    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
        System.out.print("Enter the stack size: ");
        int n = in.nextInt();
        stack s = new stack(n);
        System.out.print("Enter number of elements to push: ");
        int m = in.nextInt();
        for(int i=0;i<m;i++)
        {
            int val = in.nextInt();
            s.push(val);
        }
        s.display();
       // s.pop();
       // s.display();
       // s.count();
        s.peek();
        in.close();
        }
    }

}
