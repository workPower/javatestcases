import java.util.Scanner;

public class CountwordwithoutUchar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter string");
        String sample = "hi hello hyd.";
        int wcount=0;
        int k=0;
            for(int i=0;i<sample.length();i++){
           
                if(sample.charAt(i)==' ' || sample.charAt(i)=='.'){
                    System.out.println(sample.subSequence(k, 1+i));   
                    k=i;
                }
               
            }


        System.out.print(wcount);
        s.close();
    }
}
