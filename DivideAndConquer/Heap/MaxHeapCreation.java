/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

/**
 *
 * @author nagad
 */
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.ceil;
public class MaxHeapCreation {
    public static void main(String[] args) throws Exception{
    System.out.println("Enter no.of elements:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n+1];
    for(int i=0;i<n;i++)
        a[i]=-1;
   
    for(int i=0;i<n;i++)
    {
        
        percolateUp(sc.nextInt(),a,i);
        
    }    
    for(int i=0;i<n;i++)
    {
        
     System.out.println(" "+i+": "+a[i]);
        
    }
    }

    private static void percolateUp (int nextInt, int[] a, int i) throws Exception{
        a[i]=nextInt;
        int temp=0;
       
    //    System.out.println("i= "+i+" ;  parent= "+((int)(ceil((double)(i/2)))-1)    );
        while(i>0 && a[((int)(ceil((double)i/2)))-1]<nextInt )
        {
        temp=nextInt;
        a[i]=a[((int)(ceil((double)i/2)))-1];
        a[((int)(ceil((double)i/2)))-1]=temp;
        i=((int)(ceil((double)i/2)))-1;
        
        
        }
       
   
       
    }
}
