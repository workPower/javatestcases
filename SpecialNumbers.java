// package Java;
class SpecialNumbers{
    public static void main(String[] args) {
        System.out.println("hello");
        for(int i=1;i<=10000;i++){
            int temp=i;
            while(temp>0){
                if((temp%10==2)|| (temp%10==5)){
                    temp=temp/10;
                }  
                else break; 
            }
           if(temp==0){System.out.print(i+ "  ");}
        }
    }
}