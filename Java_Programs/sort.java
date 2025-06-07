import java.util.Scanner;
public class sort {
    public static int selection(int arr[]){
        int min;
        int temp;
        for(int i=0;i<arr.length-1;i++){
           min=i;
           int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    
                   count++;
                }
            }
            if(count>0){
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
     }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" "); 
        }
        return 0;
    }
    public static int bubble(int arr[]){
        int i;
        for(i=0;i<arr.length-1;i++){
            int sort=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
        {  
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp; 
             sort++;
        }          }
        System.out.print(arr[i]+" ");
        if(sort==0){
            break;
        }
        }
        for(int j=i+1;j<arr.length;j++){
            System.out.print(arr[j]+" "); 
        }
        
        return 0;
    }
    public static void main(String args[]){
      int arr[]={9,7,8,5,1,4};
      selection(arr);
      
    }
    
}
