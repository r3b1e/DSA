
import java.util.*;
public class rainwater {
    public static void main(String[]args){
       int matrix[]={1,3,5,7,2,0,4};
       for(int i=0;i<matrix.length;i++){
         while(i<(matrix.length) && matrix[i]<matrix[i-1]){
          int temp=matrix[i];
          matrix[i]=matrix[i-1];
          matrix[i-1]=temp;
          i--;
         }
       }
       for(int i=0;i<matrix.length;i++){
          System.out.print(matrix[i]);
       }
                       
    }
}
