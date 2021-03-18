import java.util.Scanner;
public class NumberInAP {
 public static void main(String[] a) {
    Scanner scan=new Scanner(System.in);
    int input1,input2,input3,diff;
    input1=scan.nextInt();
    input2=scan.nextInt();
    input3=scan.nextInt();
    int sum=input2;
    diff=input2-input1;
 
        int temp=4;
        while(temp<=input3){
            sum=sum+diff;
            temp++;
        }
        System.out.print(sum);
  
        scan.close();
    
    
 }
}