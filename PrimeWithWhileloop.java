// PRIME NUMBERS WITH WHILE LOOP 

// package javatest;

public class PrimeWithWhileloop {

	public static void main(String[] args) {

		for(int n=1;n<99;n++)
		{
		int i=2;
		while( (i<=(n-1)) && ((n%i++)!=0) ); //while
		if(i==n) {System.out.print(n+ " ");} //if-condition
		}//for-loop
		
	}//main
}//class
