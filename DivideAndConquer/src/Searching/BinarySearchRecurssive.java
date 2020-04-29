/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author nagad
 */
public class BinarySearchRecurssive {
    public static void main(String[] args)
    {
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
        int low=0;int high=n-1;
        int index=search(a,low,high,element);
        if(index!=-1)
            System.out.println("Element Fount At "+index);
        else
            System.out.println("Element Not Found");
    }

    private static int search(int []a,int low, int high, int element) {
        int mid=(low+high)/2;
        if(low<=high){
            if(a[mid]==element)
                return mid;
            else if(a[mid]>element)
                return search(a,low,mid-1,element);
            else
                return search(a,mid+1,high,element);
        }
        return -1;
        
       
    }
    
}
