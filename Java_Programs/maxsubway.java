import java.util.Scanner;
public class maxsubway {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int arr[]={-8,-5,-8,-1};
           int n=arr.length;
        //   int max=Integer.MIN_VALUE;
        //   int pri[]=new int[n];
        //   pri[0]=arr[0];
        //   for(int i=1;i<n;i++){
        //     pri[i]=pri[i-1]+arr[i];
        //   }
        //   for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int start=i;
        //         int end=j;
        //         int count=start==0?pri[end]:pri[end]-pri[start-1];
        //         System.out.println(count);
        //         if(count>max){
        //             max=count;
        //         }
        //     }
        //   }
        //   System.out.print(max);
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }
        if(cs==0){
            max=arr[0];
            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    max=arr[i+1];
                }
            }
        }
        System.out.print(max);
    }
    
}
