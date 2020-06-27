/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disjointsets;


import static java.lang.System.exit;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nagad
 */
public class DisJointSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello!...This program is used to detect presence of cycles in a graph for the given edges\n"
                + "Enter No.of vertices:");
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        System.out.println("Your vertices are from 0 to "+(vertices-1)+"\nEnter no.of edges:");
        int n=sc.nextInt();
        if(n>=((vertices)*(vertices-1))/2){
            System.out.println("No.of Edges must be less than that of Vertices");
            exit(0);
        }
        int a[]=new int[vertices];
        Arrays.fill(a, -1);
        System.out.println(":: You have to enter edges in the form - u v ::");
        for(int i=0;i<n;i++){
            System.out.println("Enter Edge "+(i+1)+":");
            int u1=sc.nextInt();
            int v1=sc.nextInt();
            int u=parent(u1,a);
            int v=parent(v1,a);
            if(u!=v){
                a[v]=u;
            }
         
            else{
                System.out.println("Cycle Formed at this edge");
                
            }
           
        }
        System.out.println("The array representation is:\ni a[i]");
        for(int i=0;i<a.length;i++)
            System.out.println(i+"  "+a[i]);
        
    }

    private static int parent(int u1, int[] a) {   
        int u=u1;
        int t=a[u];
        while(t!=-1){
            u=t;
            t=a[t];
        }
        return u;
    }
    
}
