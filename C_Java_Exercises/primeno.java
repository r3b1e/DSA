import java.util.Scanner;

public class primeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime no");
        }
        else if(count>0){
            System.out.println("not a prime no");
        }
        else{
            System.out.println("in valid no");
        }
      }
}
