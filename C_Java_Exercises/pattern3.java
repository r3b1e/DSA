import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();
       int a=n;
       
        for(int i=1;i<=n;i++){
            int b=i;
            for(int k=1;k<=a;k++){
                System.out.print(b);
                    b++;
            }
            
            System.out.println();
         a--;
        }
    }
}
