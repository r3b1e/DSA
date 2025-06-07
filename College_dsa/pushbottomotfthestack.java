import java.util.Arrays;
import java.util.Stack;

public class pushbottomotfthestack {
    public static void pushatlast(Stack<Integer> s, int val){
        if(s.empty()){
          s.push(val);
            return;
        }
        int data = s.pop();
        pushatlast(s, val);
        s.push(data);

    }
    public static void reverseastack(Stack<Integer> s){
        if(s.size() == 0){
           return ;
        }
           int data = s.pop();
           reverseastack(s);
           pushatlast(s, data);
    }
    public static void main(String args[]){
       Stack<Integer> s = new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       reverseastack(s);
       while(!s.empty()){
        System.out.println(s.peek());
        s.pop();
       }
       int[] arr = {2,1,5,6,2,3};
       System.out.println(Arrays.toString(nextgreater(arr)));
       System.out.println(histogram(arr));

    }
    public static int stockspan(int[] arr){
        int buy = 0;
        int sell = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
          sell = i;
          if(arr[buy]>arr[sell]){
            buy = sell;
          }
          int recentmax = arr[sell]-arr[buy];
          max = Math.max(recentmax, max);
        }
        return max;
    }
    public static int[] stackstock(int[] arr, Stack<Integer> s){
       int[] span = new int[arr.length];
       span[0] = 1;
       s.push(0);
       for(int i=1;i<arr.length; i++){
        
           while(!s.empty() && arr[s.peek()]<arr[i]){
            s.pop();
            }
            if(s.empty()){
                span[i] = i+1;
            }
            else{
           span[i] = i - s.peek();
        }
        s.push(i);
       }
       return span;
    }
    public static int[] nextgreater(int[] arr){
          Stack<Integer> s = new Stack<>();
          int[] next = new int[arr.length];
         next[arr.length-1] = -1;
         s.push(arr[arr.length-1]);
          for(int i = arr.length-2; i>=0; i--){
              while(!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
              }
              if(s.isEmpty()){
                next[i] = -1;
              }
              else{
                next[i] = s.peek();
              }
              s.push(arr[i]);
          }
          return next;
    }
    public static boolean parenthesis(char[] arr){
      Stack<Character> s = new Stack<>();
      // s.push(arr[0]);
      for(int i=0;i<arr.length;i++){
        char ch = arr[i];
        if(ch == '(' || ch == '{' || ch == '['){
        s.push(ch);
        }
        else if(!s.isEmpty() && ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{') || (ch == ']' && s.peek() == '['))){
            s.pop();
        }
        else{
          return false;
        }
        
      }
      return s.isEmpty();
    }
    public static boolean dublicateparenthesis(String str){
      Stack<Character> s = new Stack<>();  
      for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            s.push(ch);
            int count = 0;
            if(ch == ')'){
              s.pop();
              while(s.peek() != '('){
                s.pop();
                count++;
              }
              s.pop();
              if(count == 0){
                return true;
              }
            }

        }
        return false;
    }
    public static int histogram(int[] arr){
      int left = 0;
      int right = arr.length-1;
      int maxrec = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int min = minfrombetween(arr, left, right);
            int breth = right-left+1;
            int rec = breth*min;
            maxrec = Math.max(maxrec, rec);
            if(arr[left]<arr[right]){
              left++;
            }
            else{
              right--;
            }
        }
        return maxrec;
    }
    public static int minfrombetween(int[] arr, int st, int ed){
      int min = Integer.MAX_VALUE;
      for(int i=st;i<=ed;i++){
        min = Math.min(min, arr[i]);
      }
      return min;
    }
}
