package treee;

import java.util.*;

public class tree {
    static Scanner in = new Scanner(System.in);

    Node createTree()
    {
         System.out.print("Enter value (-1 for no node):");
         int value = in.nextInt();

         if(value==-1)
         {
            return null;
         }

         Node nn = new Node(value);

         System.out.println("Enter left child of "+ value);
         nn.left = createTree();

         System.out.println("Enter right child of "+value);
         nn.right = createTree();

         return nn;
    }

    void preorder(Node node)
    {
        if(node == null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node)
    {
        if(node == null)return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    void postorder(Node node)
    {
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    

    public static void main(String[]args)
    {
        tree tree = new tree();

        tree.root = tree.createTree();

        

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.print("\nInorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
    Node root;
}
