import java.util.ArrayList;

public class test {
         public static ArrayList<String> sub(String a, String b){
        if(b.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(a);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
             ans.addAll(sub(a+b.charAt(0),b.substring(1)));
             ans.addAll(sub(a,b.substring(1)));
             return ans;
    }
    public static int maze2(int r, int d, String p){
        int first=0;
        int second=0;
        int third=0;
        if(r==1 && d==1){
            return 1;
        }
        if(r==1){
            first += maze2(r, d-1, p+'d');
        }
        if(d==1){
            second += maze2(r-1, d, p+'r');
        }
        if(r>1 && d>1){
            first += maze2(r-1, d, p+'r');
            second +=maze2(r, d-1, p+'d');
            third += maze2(r-1, d-1, p+'d');
        }
        return first+second+third;
    }
    public static void mazewithdia(int r, int d, String p){
        if(r==1 && d==1){
            System.out.println(p);
            return;
        }
        if(r==1){
            mazewithdia(r, d-1, p+'d');
        }
        if(d==1){
            mazewithdia(r-1, d, p+'r');
        }
        if(r>1 && d>1){
        mazewithdia(r-1, d, p+'r');
        mazewithdia(r, d-1, p+'d');
        mazewithdia(r-1, d-1, p+'D');
        }
    }

    public static void main(String[] args) {
        // System.out.println(sub("", "abc"));
        // mazewithdia(3, 3, "");
        System.out.println(Knight(3, new boolean[3][3], 0));
    }
    public static int Knight(int n, boolean[][] board, int row) {
        if (n == 0) {
            toprint(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafeKnigth(board, row, col)) {
                board[row][col] = true;
                count += Knight(n - 1, board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    
    public static boolean issafeKnigth(boolean[][] board, int r, int c) {
        if (isvalid(board, r - 1, c - 2) && board[r - 1][c - 2]) {
            return false;
        }
        if (isvalid(board, r - 1, c + 2) && board[r - 1][c + 2]) {
            return false;
        }
        if (isvalid(board, r + 1, c - 2) && board[r + 1][c - 2]) {
            return false;
        }
        if (isvalid(board, r + 1, c + 2) && board[r + 1][c + 2]) {
            return false;
        }
        return true;
    }
    
    public static boolean isvalid(boolean[][] board, int r, int c) {
        return r >= 0 && c >= 0 && r < board.length && c < board.length;
    }
    public static void toprint(boolean[][] price){
        for(boolean i[]:price){
            for(boolean j:i){
           if(j){
            System.out.print("k");
           }
           else{
            System.out.print("X");
           }
        }
        System.out.println();
        }
    }

    }

