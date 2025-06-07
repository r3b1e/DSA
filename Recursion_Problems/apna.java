import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class apna {
public static void main(String[] args) {
    int arr[]={3,4,6,5,9,2,5};
    int arr1[]={11,15,5,7,9,10};
    // 1)System.out.println(tiling(3));
    // 2)repeate("apnacollage", new boolean[26], 0, "");
    // 3)consicutive("", 3);
    // 4)quick(arr,0, arr.length-1);
    // System.out.println(Arrays.toString(arr));
    // 5)subsequence("", "abc");
    // 6)  System.out.println(totaltraped(arr, 0, arr.length-1, 0));
    System.out.println(twopointer(arr1,19,0,0 ));
}
// 1)tiling problem
public static int tiling(int n){
    if(n<2){
        return 1;
    }
   return tiling(n-1)+tiling(n-2);
}
// 2)removing repeated element from the array
public static void repeate(String s, boolean[] store, int ind, String p){
    if(ind == s.length()){
        System.out.println(p);
        return; 
    }
    char ch = s.charAt(ind);
    if(store[ch-'a']){
        repeate(s, store, ind+1, p);
    }
    else{
        store[ch-'a']=true;
        repeate(s, store, ind+1, p+ch);
    }
    return;
}
// 3)convert it without concicutive of 1 
public static void consicutive(String p, int n) {
    if(n==0){
        System.out.println(p);
        return;
    }
    if(p.length()>0 && p.charAt(p.length()-1)=='1'){
        consicutive(p+'0', n-1);
    }
    else{
        consicutive(p+'1', n-1);
        consicutive(p+'0', n-1);
    }
        return;
}
// 4)quick search
public static void quick(int arr[], int st, int ed){
  if(st>=ed){
   return;
  }
    int portion = partition(arr, st , ed);
    quick(arr, st, portion-1);
    quick(arr, portion+1, ed);
}
public static int partition(int arr[], int s, int e){
    int i=s-1;
    int pivote=arr[e];
    for(int j=s;j<e;j++){
        if(arr[j]<pivote){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp1=pivote;
    arr[e]=arr[i];
    arr[i]=temp1;
    return i;
}
// 5)subsequence
public static void subsequence(String p, String up) {
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    for(int i=0;i<up.length();i++){
        char ch=up.charAt(i);
    String f=up.substring(0, i);
    String s=up.substring(i+1, up.length());
        subsequence(p+ch, f+s);
    }
}
public static int totaltraped(int[] arr, int s,int end,int max){
    if(s==end){
       return max;
    }
    int min=Math.min(arr[s], arr[end]);
   int width=(end-s)*min;
   if(arr[s]>arr[end]){
   return totaltraped(arr, s, end-1, Math.max(max,width));
}
else{
    return totaltraped(arr, s+1, end, Math.max(max,width));
}
}
public static boolean twopointer(int[] arr, int target,int lp,int rp){
    int n=arr.length;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
           lp=i;
           rp=i+1;
           break;
        }
    }
    while(lp!=rp){
        if(arr[lp]+arr[rp]==target){
            return true;
        }
        else if((arr[lp]+arr[rp])>target){
            lp=(n+lp-1)%n;
        }
        else{
            rp=(rp+1)%n;
        }
    }
    return false;
}
}
