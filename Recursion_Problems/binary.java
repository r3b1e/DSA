public class binary {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,9};
        System.out.println(search(arr,45,0,arr.length-1));
    }
    public static int search(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid;
        mid=(s+e)/2;
        if(arr[mid]<target){
           return search(arr, target, mid+1, e);
        }
        else if(arr[mid]>target){
            return search(arr, target, s, mid-1);
        }
        
            return mid;
        
    }

