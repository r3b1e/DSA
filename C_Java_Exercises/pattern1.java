import java.util.Scanner;

public class pattern1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n=sc.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<a;j++){
                System.out.print(a);

            }
            
            System.out.println(a);
         a--;
        }
       
      }
}
