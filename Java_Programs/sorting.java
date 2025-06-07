import java.util.Scanner;
public class sorting {
    public static void swaping(int f[]){
        int last=f.length-1;  
      for(int i=0;i<last;i++){
      int temp=f[i];
          f[i]=f[last];
          f[last]=temp;   
          last--;
           }
           for(int i=0;i<f.length;i++){
            System.out.print(f[i]+"  ");
           }
    }
    public static int binarysearch(int f[]){
        int start=0,end=f.length-1;
        
       while(start<=end){
        int mid=(start+end)/2;
        if(f[mid]==10){
           return mid;
        }
        else if(f[mid]>10){
          end=mid-1;
        }
        else if(f[mid]<10){
            start=mid+1;
        }
       }
       return -1;
    }
    public static void pairsubarray(int f[]){
        int start=0,end=f.length-1;
        for(int i=0;i<f.length;i++){
         for(int j=i+1;j<f.length;j++){
           System.out.print("("+f[i]+","+f[j]+")");
         }
         System.out.println();
        }
    }
    public static void subarray(int f[]){
        int start=0,end=f.length-1;
          for(int i=0;i<f.length;i++){
            for(int j=i;j<f.length;j++){
                System.out.print(f[j]);
                for(int k=j+1;k<f.length;k++){
                  System.out.print(","+f[k]);
                }
                System.out.println();
            }
          }
    }
    public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
    int f[]=new int[5];
    for(int i=0;i<f.length;i++){
    f[i]=sc.nextInt();
    }
    subarray(f);
    }
}
