import java.util.LinkedList;
import java.util.Queue;

public class binary_1 {
    public static void main(String[] args) {
    // int[] arr = {2, 3, 5, 9, 14, 16, 18};
    // trappedrainwater(arr);
    // int st = 0;
    // int ed = arr.length-1;
    // int target = 7;
    // int max = Integer.MIN_VALUE;
    //    while(st<ed){
    //     int mid = st + (ed-st)/2;
    //     if(arr[mid]==target){
    //      max = mid;
    //      st = mid;
    //      ed = st-1;
    //     }
    //     else if(arr[mid]>target){
    //         ed = mid-1;
    //     }
    //     else{
    //         st = mid+1;
    //     }

    // }
    // if(arr[ed]<target){
    //     System.out.println(arr[ed]);
    // }
    // else{
    // System.out.println(arr[st]);}
    Queue<Integer> que = new LinkedList<>();
    for(int i = 1;i<=10;i++){
       que.add(i);
    }
    Interleave(que);
    while(!que.isEmpty()){
        System.out.print(que.remove());
    }
    
}
public static void trappedrainwater(int[] arr){
    int n = arr.length;
    int left[] = new int[n];
    int right[] = new int[n];
    int lefmax = 0;
    int rigmax =0;
    int res = 0;
    for(int i = 0;i<n;i++){
        lefmax = Math.max(arr[i], lefmax);
        left[i] = lefmax;
    }
    for(int i = n-1;i>=0;i--){
        rigmax = Math.max(arr[i], rigmax);
        left[i] = rigmax;
    }
    int count = 0;
    for(int i=0;i<n;i++){
        int height = (Math.min(left[i], right[i])-arr[i]);
        if(height>0){
        count += height;}
    }
    System.out.println(count);

}
public static void homogram(int[] arr){
    
}
public static void Interleave(Queue<Integer> que1){
   Queue<Integer> que2 =new LinkedList<>();
   int n = que1.size();
   n = n/2;
   for(int i = 0;i<n;i++){
    que2.add(que1.remove());
   }
   for(int i = 0;i<n;i++){
    que1.add(que2.remove());
    que1.add(que1.remove());
   }
}
}
