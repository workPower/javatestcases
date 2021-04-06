class ArayyindxRepeat{
public static void main(String[] args) {
    double[] n={8,3,11,11,10};
    double myHeight=0.5;
    int  count=0;
    for(int i=0;i<n.length;i++){
        if(myHeight<n[i]){
            myHeight=n[i];
            count++;
        }
    }
    int rate=3;
    int price=rate*count;
    System.out.print("Salary "+price);
}

}