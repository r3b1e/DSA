import java.util.*;
public class temp {
  public static void main(String ars[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value");
    int n,i,j,k,a,b,star,space;
    
    
    n=sc.nextInt();
    a=n/2+1;
    b=1;
    for(i=1;i<=n;i++){
      
      

      for(space=1;space<a;space++){
        System.out.print(" ");
        
      }
      for(star=1;star<=2*b-1;star++){
        System.out.print("*");
      }
     
      System.out.println();
     if(i>=(n/2+1)){
      a++;
      b--;}
      else {
        a--;
      b++;
      }

    }
    System.out.print("sunny");
  }
}