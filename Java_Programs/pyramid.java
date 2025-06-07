import java.util.Scanner;

public class pyramid {
    public static void tower(int n,char s,char h,char d){
        if(n==0){return;}
        tower(n-1,s,d,h);
        System.out.printf("%c-->%c"+s,d);
        tower(n-1,h,s,d);
        return;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     tower(3,'A','B','C');
     sc.close();
    }
    
}
