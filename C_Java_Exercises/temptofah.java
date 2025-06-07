import java.util.Scanner;

public class temptofah {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature:");
        int temp=sc.nextInt();
        float fahrenheit=(float)((temp*1.8)+32);
        System.out.println(fahrenheit);
        
      }
}
