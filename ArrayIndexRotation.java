/*
 * example an array with 1 2 3 4 5
 * 					shifting last index element to firstIndexElement  
 * 			How many Elements to be shifted eg :last 2 elements to first
 */

// package javatest;
//import java.util.Scanner;
public class ArrayIndexRotation {
	public static void main(String[] ar) {
//		System.out.print("WEewl,c");
//		Scanner scan =  new Scanner(System.in);
		int []a= {1,2,3,4,5};int count=0;
		
		while(count++<2) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		}
		for(int k:a) {
			System.out.print(k +" ");
		}
		
	}//main
}//class

