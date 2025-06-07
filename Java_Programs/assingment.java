
public class assingment {
         public static void main(String[]args){
           int arr[]={-4,-1,1,2};
       int st=0;
       int end=arr.length-1;
       int index;
       int target=1;
       while(st<=end){
        int mid=(st+end)/2;
        if(arr[mid]==target){
            System.out.print(mid);
            break;
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else if(arr[mid]<target){
            st=mid+1;
        }
    }
      //  int sum=0;
      //  if(mid!=0 && mid!=nums.length-1){
      //     sum=nums[mid-1]+ nums[mid] + nums[mid+1];
      //     System.out.print(sum);
      //  }
      //  else if(mid==0){
      //   sum=nums[0]+nums[1];
      //   System.out.print(sum);
      //  }
      //  else {
      //   sum=nums[nums.length-1]+nums[nums.length-2];
      //   System.out.print(sum);
      //  }
       
       } 
}