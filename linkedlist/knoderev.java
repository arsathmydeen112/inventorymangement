import java.util.*;
class knoderev
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            int n = in.nextInt();
            Node head = null;
            Node temp = null;
            for(int i=0;i<n;i++)
            {
                int val = in.nextInt();
                Node nn = new Node(val);
                if(head==null)
                {
                    head = nn;
                    temp = nn;
                }
                else
                {
                    temp.next = nn;
                    temp = nn;
                }
            }
            int k = in.nextInt();
            
            Node t = rev(head,k);
            int count = 0;
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.next;
                count++;
            }
            System.out.println();
            System.out.print("Count: "+count);
            
        }
    }
    public static Node rev(Node head,int k)
    {
        Node current = head;
        Node prev = null;
        Node next = null;
        
        int count = 0;
        
        Node t = head;
        int i = 0;
        while(t!=null&&i<k)
        {
            t=t.next;
            i++;
        }
        
        if(i<k)return head;
        
        while(current!=null &&count<k)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        if( next!=null)
        {
            head.next = rev(next,k);
        }
        return prev;
    }
    
}
class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}