
import java.util.*;
public class binarytodesimal {
    public static int byn2dec(int n){
        int des=0,lds;
        int wer=0;
        while(n>0){
          
            lds=n%10;
            des=des+(lds*(int)Math.pow(2,wer));
            n=n/10;
            wer++;
            
        }
        return des;
    }
    public static int dec2byn(int n){
   int byn=0,a,b;
   int c=0;
   while(n>0){
    a=n/2;
    b=n%2;
    byn=byn + (b*(int)Math.pow(10,c));
    n=a;
    c++;
   }
   return byn;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a;
        a=sc.nextInt();
        System.out.print("n is"+a+"number"+a+"\n");
        int b=dec2byn(a);
        System.out.print(b);
        
    }
    
}
