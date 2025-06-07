import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no string");
        int n=sc.nextInt();
       int a=n;
        for(int i=1;i<=n;i++){
            for(int k=2;k<=i;k++){
                System.out.print(" ");

            }
            for(int j=1;j<=a;j++){
                System.out.print("*");

            }
            
            System.out.println();
         a--;
        }
        
      }
}
