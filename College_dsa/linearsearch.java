
public class linearsearch {
    public static int linear(int arr[],int target){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==target){
                break;
            }
        }
        return i;
    }
    public static int binary(int arr[],int target){
           int i;
           int mid=arr.length/2;
           for(i=0;i<mid;i++){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                mid--;
            }
            else if(arr[mid]<target){
                mid++;
            }
           }
           return 0;
    }
    public static int binarysearch(int arr[],int target){
        int st=0;
        int end=arr.length-1;
       
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={-1,1,1};
        int target=10;
        System.out.println(binarysearch(arr,2));
    }
}
