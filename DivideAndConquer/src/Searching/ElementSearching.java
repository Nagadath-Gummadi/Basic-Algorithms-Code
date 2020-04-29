/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;
/**
 *
 * @author nagad
 */
import java.util.Scanner;
public class ElementSearching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1.LinearSearch\n2.Binary Search Using Iteration\n3.Binary Search Using Recursion");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1)
            new LinearSearch();
        else if(opt==2)
            new Searching.BinarySearchIterative();
        else if(opt==3)
            new BinarySearchRecurssive();
        System.out.println("dd");
            
    }
    
}
