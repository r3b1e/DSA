
import java.util.Scanner;

public class alter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no string");
        String str=sc.nextLine();
        
        for(int i=0;i<str.length()-1;i+=2){
            if(str.charAt(i) != ' '){
            System.out.print(str.charAt(i)+" ");
            }
        }
      }
}
