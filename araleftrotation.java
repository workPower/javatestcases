import java.io.*;
import java.util.*;


public class araleftrotation {
    
    // Complete the rotLeft function below.
    static void rotLeft(int[] a, int d) {
        while((d--)>0){
        int temp=a[0];
        for(int i=0;i<a.length-1;)
        {
            
            a[i]=a[++i];
        }//forloop
        a[a.length-1]=temp;
    }//while
     for(int i:a){
            System.out.print(i +" ");
        }
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int d=2;
        int a[]={1,2,3,4,5};
        rotLeft(a, d);     
        
       
        scanner.close();
    }
}
