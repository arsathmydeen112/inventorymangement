package linkedlist;

import java.util.*;

public class demo {
        public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            int n = in.nextInt();
            int a[] = new int[n];
            LinkedList<Integer>list = new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                a[i] = in.nextInt();
            }
            int tar = in.nextInt();
            boolean x = false;
            for(int i=0;i<n;i++)
            {
                if(a[i]==tar)
                {
                list.add(i);
                x = true;
                }
            }
            if(x==false)
            {
                System.out.print("NO OCCURRENCES");
            }
            else
            {
                System.out.print(list.get(0)+" ");
                System.out.print(list.getLast());
            }
            
        in.close();   
        }
    }

}
