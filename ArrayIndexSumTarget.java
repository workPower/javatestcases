/*
 *  Array to find target :-)sum to index of an array
 *  example: a[]={1, 2, 3, 4, 5}  
 *  TARGET: 7
 *  OUTPUT: 2 , 3  i.e a[2]+a[3]=3+4=7
 */

// package javatest;
import java.util.Scanner;
public class ArrayIndexSumTarget {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int n = scan.nextInt();
		System.out.println("Enter array elemnets");
		int a[] = new int[n];
		//Input  array elements
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		//print array  elements
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.print("enter a target  value");
		int target=scan.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.print(" target got @ "+i+" "+ j +" " );
				}
			}
		}
	}

}
