package Searching;
import Searching.ElementSearching;
import java.util.Scanner;

public class BinarySearchIterative {
    public static void main(String[] args){
        int n;
        System.out.println("Enter No.Of Elements You Want To Enter:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Elements In Ascending Order Only:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter an element to search:");
        int element=sc.nextInt();
        int low=0;int high=n-1;int mid=(low+high)/2;
        while(low<=high){
            if(a[mid]==element){
                System.out.println("Element Found at "+mid);
                System.exit(0);
            }
            else if(a[mid]<element)
                low=mid+1;
            else
                high=mid-1;
            mid=(low+high)/2;
        }
        System.out.println("Element not found");
    }
}
