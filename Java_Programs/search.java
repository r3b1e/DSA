import java.util.Scanner;

public class search {
   
    public static int largest(int f[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            f[i]=sc.nextInt();
        }
        int largest=f[0];
        for(int i=1;i<10;i++){
            if(f[i]>largest){
              largest=f[i];
            }
           
        }
        return largest;
        
    }
    public static void main(String args[]){
        System.out.print("jai shree ram");
        Scanner sc = new Scanner(System.in);
        int f[]=new int[10];
        
     
         int a=largest(f);
         System.out.print(a);
         

    }
    
}
