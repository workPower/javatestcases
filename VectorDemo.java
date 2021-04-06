class VectorDemo {
    public static void main(String[] args) {
        int N=6;
String output[] =  new String[N];    
String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

int index=-1;

//part1
 output[++index]=Alpha.substring(0,N);
// System.out.println(output[0]);

//part2

 int row=N-2;
 int alphalocate=N;
        
    for(int i=2;i<N;i++){
        String sym="";
        for (int j=1;j<=row;j++){
            sym=sym+"$";}
            
        String str = Alpha.charAt(alphalocate++)+ sym+Alpha.charAt(alphalocate++);
        output[++index]=str;
    
    }
 


//part3
if(index<N-1){
    output[++index]=Alpha.substring(alphalocate++,(alphalocate + (N-1)));

}

//final output
 for(String i:output){
            System.out.println(i);
      }   



    }//main
}//class