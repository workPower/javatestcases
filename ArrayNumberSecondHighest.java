// package Java;
public class ArrayNumberSecondHighest {
    public static void main(String[] args) {
        int a[]={10,20,32,5,1,66,42,14};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                   temp=a[i]; 
                    a[i]=a[j];
                    a[j]=temp;;

                }
            }
            
        }
        
        // System.out.println(a.length-1);
       for(int i=0;i<=a.length-1;i++){
        System.out.print(a[i] + "  ");
       }
        System.out.println("heel");
    }
}
