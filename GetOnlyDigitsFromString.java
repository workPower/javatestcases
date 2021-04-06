import java.util.Scanner;
public class GetOnlyDigitsFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("enter a string");
            String sample=scan.nextLine();
            System.out.print("entered String is "+sample);
            String out ="";
            // String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            String Number="0123456789";
            sample=sample.trim();
            for(int i=0;i<sample.length();i++){
                for(int j=0;j<Number.length();){
                    if(sample.charAt(i)==Number.charAt(j++)){
                        out=out+sample.charAt(i);
                }  //if 
               } // j
            } // i
            System.out.print("\n"+out);
        } //try
        finally{
            scan.close();
        }
    }
}
