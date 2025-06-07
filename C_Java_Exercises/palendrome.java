
import java.util.Scanner;

public class palendrome {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no digit");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter value of an array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<n/2;i++){
        if(arr[i]!=arr[n-1-i]){
            count++;
        }
     
      }
      if(count==0){
        System.out.println("it is a palendrome");
      }
      else{
        System.out.println("it is not a palendrome");
      }
      
    }
}
