package Heap;
import static java.lang.Math.ceil;
import java.util.Scanner;
public class MaxHeapDeletion {
    public static void main(String[] args) throws Exception
    {        
        System.out.println("Enter max no.of elements:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]a=new int[m];
        System.out.println("Enter no.of elements you want to enter:");
        int n=sc.nextInt();
        if(n>m)
        {
            System.out.println("Invalid range");
            System.exit(0);
        }
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
        int in=1;
        System.out.println("Press 1 to delete one element from heap.\nPress any other key to exit ");
        in=sc.nextInt();
        while(in==1 && n>=0)
        {
            int element=deleteFromHeap(a,n);
            System.out.println("Deleted Element:"+element);
            n--;
            System.out.println("Press 1 to delete one element from heap.\nPress any other key to exit ");
            in=sc.nextInt();
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

    private static int deleteFromHeap(int[] a, int n) {
        int element=a[0];
        a[0]=a[n-1];
        n--;
        int i=0;
        int maxchild;
        maxchild=maximum((2*i+1),(2*i+2),a);
        int parent=0;
        while(a[maxchild]>a[parent] )
        {
            int temp=a[parent];
            a[parent]=a[maxchild];
            a[maxchild]=temp;
            parent=maxchild;
            maxchild=maximum((2*i+1),(2*i+2),a);
                   
        }
        return element;
        
    }

    private static int maximum(int i, int i0, int[] a) {
        if(a[i]>a[i0])
            return i;
        else
            return i0;
        
    }
    
}
