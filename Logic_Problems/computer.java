import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class computer {
    public static void main(String[] args) {
        System.out.println(print1_n(70048));
        int arr[] = {7, 8, 9, 10, 1, 3, 5, 6};
        System.out.println(returning(4, arr, 0));
        System.out.println(Arrays.toString(arr));
        System.out.println(uper("abc", ""));
        fact(10);
        tower(3, 'S', 'H', 'D');

    }

    public static int print1_n(int n) {
        int count = 0;
        if (n % 10 == 0) {
            count += 1;
        }
        if (n % 10 == n) {
            return count;
        }
        count += print1_n(n / 10);
        return count;
    }

    public static ArrayList<Integer> returning(int target, int[] arr, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            ArrayList<Integer> Internal = new ArrayList<>();
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        list.addAll(returning(target, arr, i + 1));
        return list;
    }
 public static void pirntboard(boolean[][] board){
        for(int i = 0; i<board.length;i++ ){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
 }
 static int min = Integer.MIN_VALUE;
 public static int fact(int n){
        if(n ==0 || n == 1){
            return n;
        }
        int minCount = Integer.MIN_VALUE;
        int fibonachi = fact(n-1)+fact(n-2);
         minCount = Math.max(minCount, fibonachi);
         if(minCount>min) {
             System.out.print(fibonachi+" ");
         }
     min = ((min > minCount) ? min : minCount);
     return fibonachi;
 }
    public static String uper(String str, String up){
        if(str.isEmpty()){
            return up;
        }
        char ch = str.charAt(0);
        return uper(str.substring(1), up+(char)(ch-32));
    }
    public static void tower(int n, char s, char h, char d){
     if(n==1){
         System.out.println(s+"->"+d);
         return;
     }
     tower(n-1, s, d, h);
        System.out.println(s+"->"+d);
     tower(n-1, h, s, d);
    }
}
