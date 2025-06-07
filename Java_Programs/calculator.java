import java.util.*;
public class calculator {

   public static void main(String arg[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter value for operends");
          int a=sc.nextInt();
          int b=sc.nextInt();
          System.out.println("which operation whoud you want to perform1)addition2)substraction3)division4)multiplication");
                               int n=sc.nextInt();
           switch(n){
            case 1:System.out.print(a+b);
            break;
            case 2:System.out.print(a-b);
            break;
            case 3:System.out.print(a*b);
            break;
            case 4:System.out.print(a/b);
            default:System.out.print("invalid carecter");
           }                    


   } 
}
