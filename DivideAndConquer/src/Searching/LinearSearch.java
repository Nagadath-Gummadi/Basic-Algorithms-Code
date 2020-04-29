/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author nagad
 * 
 */
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter No.Of Elements You Want To Enter:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter an element to search:");
        int element=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==element)
            {
                System.out.println("element is at index "+i);
                System.exit(0);
            }
        }
        System.out.println("Element Not Found");   
    }
}
