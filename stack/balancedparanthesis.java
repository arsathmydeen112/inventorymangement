package stack;
import java.util.*;
public class balancedparanthesis {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
    
            System.out.print("Enter expression: ");
            String s = in.nextLine();
            int n = s.length();

            char stack[] = new char[n];
            int top = -1;
            boolean balance = true;

            for(int i=0;i<n;i++)
            {
                char c = s.charAt(i);
                if(c=='{'||c=='['||c=='(')
                {
                    stack[++top]= c;
                }
                else if (c=='}'||c==']'||c==')') 
                {
                    if(top==-1)
                    {
                        balance = false;
                        break;
                    }

                    char pop = stack[top--];

                    if((c==')' && pop!='(')||(c==']' && pop!='[')||c==')' && pop!='(')
                    {
                        balance = false;
                        break;
                    }
                }
            }
            if(balance)
            {
                System.out.println("The given expression is balanced");
            }
            else
            {
                System.out.println("The given expression is not balanced");
            }
        in.close();
        }
    }
}
