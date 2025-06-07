import java.util.Scanner;

public class swapvaluesfromuser {
    public static void main(String[]args){
        int a,b,temp;
        System.out.println("enter the two value");
        Scanner sc=new Scanner(System.in);
               a=sc.nextInt(); 
               b=sc.nextInt();
              System.out.println("before swap" + a" "+b);
            //   System.out.println("before swap" + b);
              
             temp=a;
                a=b;
             b=temp;
             System.out.println("after swap" + a" "+b);
            //  System.out.println("after swap" + b);

    }
}
