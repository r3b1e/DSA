

import java.util.*;
class reversenumericpatten {
    
    
    
 public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    
          for( int i=1;i<=n;i++){
        char ch='A';
           for( int j=1;j<=i;j++){
          
               System.out.print(ch);
           }
            ch++;
           System.out.println();
       }
   } 
}
    

