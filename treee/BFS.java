package treee;
import java.util.*;
public class BFS {

    Node root;
    Node createTreeLevelOrder()
    {
        Scanner in = new Scanner(System.in);
        {

        System.out.println("Enter root value(-1 for no node):");
        int value = in.nextInt();
        if(value==-1)return null;
        Node nn = new Node(value);
        Queue<Node>queue = new LinkedList<>();
        queue.add(nn);

        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.println("Enter left child of "+current.data+": ");
            int left = in.nextInt();

            if(left!=-1)
            {
                current.left = new Node(left);
                queue.add(current.left);
            }

            System.out.println("Enter right child of "+current.data+" : ");
            int right = in.nextInt();

            if(right!=-1)
            {
                current.right = new Node(right);
                queue.add(current.right);
            }
        }
        in.close();
    }
        return root;
    }

    void levelOrder(Node root)
    {
        if(root == null)return;

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)queue.add(current.left);
            if(current.right!=null)queue.add(current.right);
        }
    }
    public static void main(String[]args)
    {
        BFS treee = new BFS();
        treee.root = treee.createTreeLevelOrder();
        System.out.print("Level Order: ");
        treee.levelOrder(treee.root);
    }
}
