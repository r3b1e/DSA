import java.util.*;
public class Exp_3 {
    public static void main(String[] args){
        System.out.println("aX^2+bX+c");
        System.out.println("Enter value of a, b and c:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double second = (b*b) - (4*a*c); 
        if(second<0){
            System.out.println("It is an imaginary number");
        }
        else{
           double root1 = (-b+second)/(4*a*c);
           double root2 = (-b-second)/(4*a*c);
           System.out.println(root1+"-First Root/n"+root2+"Second Root/n");
        }
    }
}
