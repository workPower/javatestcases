// package Java;
public class Static {
    static int x=10;
    // static void hel(){
    //     int a=10;
    //     System.out.println(a+x);
    // }

     void hel(){
        int a=10;
        System.out.println(a+x);
    }
    public static void main(String[] args) {
        int x=4;
        for(;x<5;x++){

        }
        System.out.println(x);
        Static s =new Static();
        s.hel();
    }    
    
}
