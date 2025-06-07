public class binary {
    public static int doublee(int target,int matrix[],boolean firstsearch){
        int st=0;
        int end=matrix.length-1;
        int mid;
        int count=0;
        int ans=-1;
        while(st<=end){
            mid=(st+end)/2;
            // if(matrix[mid]==target){
            //     System.out.println(mid);
            //     count=1;
            // }
            if(matrix[mid]>target){
                end=mid-1;
            }
            else if(matrix[mid]<target){
                st=mid+1;
            }
            else{
                ans=mid;
                if(firstsearch){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return ans;
        }
    
    public static void main(String[]args){
        int matrix[]={4,5,5,7,7,7,8,9};
        int target=3;
        int arr[]={-1,-1};
        int left=doublee(target,matrix,true);
        int right=doublee(target,matrix,false);
        arr[0]=left;
        arr[1]=right;
        System.out.println(arr[0]+"  "+arr[1]);
    }
}
