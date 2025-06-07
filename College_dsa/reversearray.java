

public class reversearray {
    public static void reverse(int arr[]){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[end];
            arr[end]=arr[st];
            arr[st]=temp;
            st++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int arr[]={1,4,8,9,10,12};
        reverse(arr);
    }
}
