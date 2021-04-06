import java.util.Scanner;
public class GetNumberFromStringBeforeSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print(" INPUT STRING ");
            String sample = scan.next();
            String out="";
            String check=" ";
            // String Numbers="0123456789";
            sample=sample.trim();
            for(int i=0;i<sample.length();i++){
                while(sample.charAt(i)!=check.charAt(0)){
                    out=out+sample.charAt(i);
                }//while
            }//forloop
            System.out.print(out);
            // for(int i=0;i<out.length();i++){
            //     for(int j=0;j<Numbers.length();j++){
            //         if(out.charAt(i)==Numbers.charAt(j)){prin=out;}
            //     }//forloop -j
            // }//forloop -i
            // System.out.print(prin);
        } catch (Exception e) {
        System.out.print("not valid SOmETHING IS WRONG");        }
        finally{
            scan.close();
        }
    }
}
