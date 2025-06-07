import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
//      helper(arr, 7, new ArrayList<>());
//        System.out.println(findTargetSumWays(arr, 3));
//        System.out.println(minNonZeroProduct(3,0, ""));
//        System.out.println(numSquares(15));

    }

    public static void helper(int[] arr, int target, ArrayList<Integer> list) {
        if (target == 0) {
            System.out.println(list);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                break;
            }
            list.add(arr[i]);
            helper(arr, target - arr[i], list);
            list.remove(list.size() - 1);
        }
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] mat = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length;j++) {
                if (board[i][j] == word.charAt(0) && isTrue(board, mat, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTrue(char[][] board, boolean[][] mat, int i, int j, String word, int n) {
        if (n == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || mat[i][j] || board[i][j] != word.charAt(n)) {
            return false;
        }
        mat[i][j] = true;
        if (isTrue(board, mat, i, j + 1, word, n + 1) ||
                isTrue(board, mat, i, j - 1, word, n + 1) ||
                isTrue(board, mat, i + 1, j, word, n + 1) ||
                isTrue(board, mat, i - 1, j, word, n + 1)) {
            return true;
        }
        mat[i][j] = false;
        return false;

    }

//    public static int findTargetSumWays(int[] nums, int target) {
//       return istrue(nums, target, 0, 0);
//    }
//
//    public static int istrue(int[] nums, int target, int n, int p) {
//        if (p == target) {
//            return 1;
//        }
//        if (n == nums.length) {
//            return 0;
//        }
//        int count = 0;
//            count += istrue(nums, target, n + 1, p + nums[n]);
//            count += istrue(nums, target, n + 1, p - nums[n]);
//        return count;
//    }
    public static int findTargetSumWays(int[] nums, int target) {
//        return istrue(nums, target, 0, 0);
        System.out.println(returnis(nums, target, 0, 0, new ArrayList<>()));
        return 0;
    }

    public static int istrue(int[] nums, int target, int n, int p) {
        if (n == nums.length) {
            return p == target ? 1 : 0;
        }
        int add = istrue(nums, target, n + 1, p + nums[n]);
        int subtract = istrue(nums, target, n + 1, p - nums[n]);
        return add + subtract;
    }
//    public static List<List<Integer>> returnis(int[] nums, int target, int n, int p, ArrayList<Integer> list) {
//        if (n == nums.length && p == target) {
//            List<List<Integer>> External = new ArrayList<>();
//            External.add(new ArrayList<>(list));
//           return External;
//        }
//        List<List<Integer>> Internal = new ArrayList<>();
//        if(n<nums.length) {
//
//            list.add(n);
//            Internal.addAll(returnis(nums, target, n + 1, p + nums[n], list));
//            list.remove(list.size() - 1);
//            list.add(n);
//            Internal.addAll(returnis(nums, target, n + 1, p - nums[n], list));
//            list.remove(list.size() - 1);
//
//        }
//        return Internal;
//    }
public static List<List<Integer>> returnis(int[] nums, int target, int n, int p, ArrayList<Integer> list) {
    if (n == nums.length && p == target) {
        List<List<Integer>> External = new ArrayList<>();
        External.add(new ArrayList<>(list)); // Add a copy of the list
        return External;
    }
    List<List<Integer>> Internal = new ArrayList<>();
    if (n < nums.length) {
        list.add(nums[n]);
        Internal.addAll(returnis(nums, target, n + 1, p + nums[n], list));
        list.remove(list.size() - 1);

        list.add(-nums[n]);
        Internal.addAll(returnis(nums, target, n + 1, p - nums[n], list));
        list.remove(list.size() - 1);
    }
    return Internal;
}
public static int minNonZeroProduct(int p, int up, String s) {
        if(p == 0 && up == 0){
            System.out.println(s);
            return 1;
        }
       if(p < 0){
           System.out.println(s);
           return up;
       }
      int right = minNonZeroProduct(p-1, up+(int)Math.pow(2, p), s+'1');
      int left = minNonZeroProduct(p-1, up, s+'0');
      return right*left;
}
        public static int numSquares(int n) {
            return helper(n);
        }

        // Helper function to compute the minimum number of perfect squares
        private static int helper(int target) {
            if (target < 0) {
                return Integer.MAX_VALUE; // Invalid path
            }
            if (target == 0) {
                return 0; // Base case: no more to add
            }

            int minCount = Integer.MAX_VALUE;
            // Iterate through all possible perfect squares less than or equal to target
            for (int i = 1; i * i <= target; i++) {
                int square = i * i;
                int result = helper(target - square);
                if (result != Integer.MAX_VALUE) {
                    minCount = Math.min(minCount, result + 1);
                }
            }
            return minCount;
        }




}
