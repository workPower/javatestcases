import java.util.*
;class Lists {
   public static void main(String[] args) {
    List <Integer> Arr = new ArrayList<Integer>();
    for(int i=1;i<=10;i++){
        Arr.add(i);
    }
    for(int i : Arr){
        System.out.print(i + "  ");
    }

    
    System.out.println(Arr.size());
    while(Arr.size()>1){
        int c= 1,k=0;
        while(c<=(Arr.size()/2)){
        Arr.remove(k);
        k=k+1;c++;
        }
    }
    
    // a = (Arr.size() / 2);

    System.out.println();
    for(int i : Arr){
        System.out.print(i + "  ");
    }
    }

    // static void fun(){

    // }
}