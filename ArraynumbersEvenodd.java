// package Java;
public class ArraynumbersEvenodd {
    public static void main(String[] args) {
        int a[]={11,25,1,224,35,46,21};
        int n=a.length;
        int b[]=new int[n];
        int c[]=new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            
            if(a[i]%2==0){
                b[j]=a[i];j++;
            }
            else{
                c[k]=a[i];k++;
            }
        }//forloop
        System.out.println("Even numbers");
        for(int i1:b){
            System.out.print(i1+" ");
        }
        System.out.println("ODD numbers");
        for(int i2:c){
            System.out.print(i2+" ");
        }


    } //main
} //class