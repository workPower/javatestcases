import java.util.Scanner;
class NCR{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter a number to find an NCR of it" + " N value "+ " R Value");
        int n=scan.nextInt();
        int r=scan.nextInt();
        float ncr;
        ncr=factfun(n)/(factfun(n-r)*(factfun(r)));
        System.out.print(ncr);
        scan.close();
    }

   static int factfun(int x){
         int fact=1;
        while(x>1){
            fact=fact*x;
            x--;
            factfun(x);
        }
        return fact;
    }
}