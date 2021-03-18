// package Java;
class pattern{
    public static void main(String[] args) {
        
        // for(int i=0;i<=5;i++){                  *
        //     for(int j=1;j<=i;j++){              * *              
        //         System.out.print("*"+" ");      * * *
        //     }                                   * * * *
        //     System.out.println();               * * * * *
        // }

        // for(int i=5;i>0;i--){                   * * * * *    
        //     for(int j=1;j<=i;j++){              * * * *
        //         System.out.print("*"+" ");      * * *
        //     }                                   * * 
        //     System.out.println();               *
        // }

        // for(int i=1;i<=5;i++){                  1
        //     for(int j=1;j<=i;){                 1 2
        //         System.out.print(j++ + " ");    1 2 3 
        //     }                                   1 2 3 4
        //     System.out.println();               1 2 3 4 5
        // }

        //  for(int i=5;i>0;i--){                     1 2 3 4 5    
        //     for(int j=1;j<=i;){                    1 2 3 4
        //         System.out.print(j++ + " ");       1 2 3
        //     }                                      1 2
        //     System.out.println();                  1
        // }

            // for(int i=1;i<=7;){                    1
            //     int m=1;                           1 0 1 
            //     for(int j=1;j<=i;j++){             1 0 1 0 1
            //         System.out.print(m + " ");     1 0 1 0 1 0 1
            //         if(m==1){ m=0;}
            //         else{ m=1;}
            //     }
            //     System.out.println();
            //     i=i+2;
            // }

        
            // for(int i=5;i>0;){                   
            //     int j=1;
            //     for(;j<=i;j++){  
            //         System.out.print(j + " ");   1 2 3 4 5 4 3 2 1   
            //     }                                1 2 3 4 3 2 1
            //     j--;                             1 2 3 2 1 
            //     for(;j>1;){                      1 2 1
            //         System.out.print(--j + " "); 1
            //     }
            //     System.out.println();
            //     i--;
            // }


            
    }
}