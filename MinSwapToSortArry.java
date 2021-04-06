public class MinSwapToSortArry {
    public static void main(String[] args) {
        int a[]={4,3,1,2};
        int  swapcount=0;
        for(int i=0;i<a.length;i++){
            int min=a[i];
            
                   for( int k=i+1;k<a.length;k++){
                       
                    if(min>a[k]){min=a[k];}//if

                    }//forloop j getting least min
                    if(a[i]>min){
                    for(int j=0;j<a.length;j++){
                        if(min==a[j]){
                            int temp=a[i]; 
                            a[i]=min;
                            a[j]=temp;
                            swapcount++;
                        }//swapp
                    }//swapploop
                    }//swapcondition
                }// first for loop i
            
       
        System.out.println(swapcount);
        for(int i:a){System.out.print(i + " ");}
    }
}
