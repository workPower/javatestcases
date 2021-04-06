// package Java;

// import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    //     int number=17,i=2;
        //  Scanner sc =new Scanner(System.in);
    //     boolean prime=true;
    //     System.out.print("enter  number");
    //     number=sc.nextInt();
    //     for(System.out.println("Verify Prime or not");i<=(number/2);i++){
    //         if(number%i==0) prime=false;
    //     }
    //     if(prime==true) System.out.print(number + " is Prime number");
    //     else System.out.print(number+ "is not a prime number");

    int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";

    for (i = 1; i <= 100; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =1; num>=1; num--)
   {
          if(i%num==0)
      {
      counter = counter + 1;
      }
   }
   if (counter ==2)
   {
      //Appended the Prime number to the String
      primeNumbers = primeNumbers + i + " ";
   }	
    }	
    System.out.println("Prime numbers from 1 to 100 are :");
    System.out.println(primeNumbers);
}
}

