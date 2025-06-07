import java.util.Scanner;

public class factor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();
        if(n<=1000 && n>0){
        System.out.println("factors of n is:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
      } 
      else{
        System.out.println("number is out of range");
      }
}
}
