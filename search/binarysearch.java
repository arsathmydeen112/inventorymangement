package search;
import java.util.*;
public class binarysearch {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Enter the size of the array");
            int n = in.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++)
            {
                arr[i] =  in.nextInt();
            }
            System.out.println("Enter the searching elements ");
            int tar = in.nextInt();
            int res = binearysearch(n,arr,tar);
            if(res==-1)
            {
                System.out.println("The given element not an array ");
            }
            else
            {
                System.out.println("The pos of an elemet is a "+res);
            }
            in.close();
        }
    }
    public static int binearysearch(int n,int arr[],int tar)
    {
            int left = 0;
            int right = n-1;
            while(left <=   right)
            {
                int mid = left+(right-left)/2;
                if(tar==arr[mid])
                {
                    return mid;
                }
                else if(tar > arr[mid])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
            return -1;
    }
    
}
