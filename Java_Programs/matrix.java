import java.util.Scanner;
import java.util.Arrays;
public class matrix {
    public static void matrix(int n,int m){
        Scanner sc=new Scanner(System.in);
       
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
              mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
              System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("entre rows");
       int n=sc.nextInt();
       System.out.print("entre coloums");
       int m=sc.nextInt();
        
       int mat[][]=new int[10][10];
       for(int i=0;i<n;i++){
           for(int j=0;i<m;j++){
             mat[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;i<m;j++){
             System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
    }
    
}
