

public class bruteforce {
    public static int brute(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                      sum+=arr[k];
                }
                max=Integer.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[]args){
        int arr[]={1,4,8,9,-10,12};
        System.out.print(brute(arr));
    }
}
