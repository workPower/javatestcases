// package Java;

public class primee {
  public static void main(String[] args) {
      int i;
    for(i=1;i<=100;i++){
        int count=0;
        for(int num=2;num<=i/2;num++){
            if(i%num==0){
                count=count+1;
                break;
            }
        }
    
        if(i==1 && count==0){
            
        }
        else if(count==0){
            System.out.print(i+ " ");
        }
    }
  }  
}
