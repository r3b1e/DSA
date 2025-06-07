import java.util.Scanner;
public class patten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value fro n");
        int n=sc.nextInt();
        int b=n;
        for( int i=1;i<=n;i++){
           // int a='A';
            for( int j=i;j<=n;j++){
                System.out.print(b);
                
            }
            b--;
            System.out.println();
        }
       
}
    }
    

