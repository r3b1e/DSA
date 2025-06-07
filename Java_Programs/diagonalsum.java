import java.util.Scanner;
public class diagonalsum{
    public static int digonal(int rpt[][]){
        int fl=0,di=0;
        for(int i=0;i<rpt.length;i++){
            for(int j=0;j<rpt[0].length;j++){
              if(i==j){
                fl+=rpt[i][j];
              }
             if(i+j==rpt.length-1){
                di+=rpt[i][j];
              }
            }
            
        }
        int total=fl+di;
            return total;
    }
    public static int digonalque(int rpt[][]){
        int fl=0,di=0;
        for(int i=0;i<rpt.length;i++){
           fl+=rpt[i][rpt.length-i-1];
           if(i!=rpt.length-1-i){
           di+=rpt[i][i];
           }
        }
        int total=fl+di;
            return total;
    }
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n;
      int arr[][]=new int[10][10];
      int ptr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                    {13,14,15,16}};
      n=sc.nextInt();
      System.out.println(n);
      System.out.println("sum of an diagonalis"+digonalque(ptr));
    }
}