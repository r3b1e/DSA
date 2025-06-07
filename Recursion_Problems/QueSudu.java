public class QueSudu {
    public static void main(String[] args) {
        // int n=5;
        // System.out.println(Queen(new boolean[n][n], 0));
        // int[][] board=new int[][]{
        //     {3, 0, 6, 5, 0, 8, 4, 0, 0},
        //     {5, 2, 0, 0, 0, 0, 0, 0, 0},
        //     {0, 8, 7, 0, 0, 0, 0, 3, 1},
        //     {0, 0, 3, 0, 1, 0, 0, 8, 0},
        //     {9, 0, 0, 8, 6, 3, 0, 0, 5},
        //     {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        //     {1, 3, 0, 0, 0, 0, 2, 5, 0},
        //     {0, 0, 0, 0, 0, 0, 0, 7, 4},
        //     {0, 0, 5, 2, 0, 6, 3, 0, 0}
        // };
        // if(solver(board)){
        //     display(board);
        // }
        System.out.println(Knight(4, new boolean[4][4], 0));
    }
    public static int Queen(boolean[][] place, int row){
        if(row == place.length){
            toprint(place);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<place.length;col++){
            if(isitture(place, row, col)){
                place[row][col] = true;
                count += Queen(place, row+1);
                place[row][col] = false;
            }
        }
        return count;
    }
    public static void toprint(boolean[][] price){
        for(boolean i[]:price){
            for(boolean j:i){
           if(j){
            System.out.print("Q");
           }
           else{
            System.out.print("X");
           }
        }
        System.out.println();
        }
    }
    public static boolean isitture(boolean[][] place, int row, int col){
        // for vertical
        for(int i=0;i<place.length;i++){
           if(place[i][col]){
            return false;
           }
        }
        // for left diagonal
        int minleft=Math.min(row,col);
        for(int i=0;i<=minleft;i++){
            if(place[row-i][col-i]){
                return false;
            }
        }
        // for right diagonal
        int minright=Math.min(row, place.length-1-col);
        for(int i=0;i<=minright;i++){
            if(place[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static boolean solver(int[][] board){
        int c=-1;
        int r=-1;
        boolean cheak=true;
    for(int i=0;i<board.length;i++){
          for(int j=0;j<board.length;j++) 
          { 
             if(board[i][j]==0){
                r=i;
                c=j;
                cheak = false;
                break;
            }
        }
        if(!cheak){
            break;
        }
        }
        if(cheak){
        // it is solved
            return true;
        }
            for(int i=1; i<=9; i++){
              if(isfree(board,i,r,c)){
                board[r][c]=i;
                if(solver(board)){
                    // it is solved
                    return true;
                }
                else{
                    // backtrack
                board[r][c]=0;
                }
              }
            }
            return false;
    }
    public static void display(int[][] board){
        for(int row[]:board){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static boolean isfree(int[][] board,int num,int r,int c){
        // for horizontal
        for(int i=0;i<board.length;i++){
            if(board[r][i] == num){
                return false;
            }
        } 
        for(int i=0;i<board.length;i++){
            if(board[i][c] == num){
                return false;
            }
        } 
        int row=(r/3)*3;
        int col=(c/3)*3;
        for(int i=row;i<(row+3);i++){
            for(int j=col;j<(col+3);j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static int Knight(int n,boolean[][] board,int row){
        if(n==0){
            return 1;
        }
        int count=0;
        for(int col=0;col<=board.length;col++){
            if(col==board.length){
                Knight(n, board, row+1);
                return 0;
            }
            if(issafeKnigth(board,row,col)){
                board[row][col]=true;
                count+=Knight(n-1, board, row);
                board[row][col]=false;
            }
        }
        return count;

    }
    public static boolean issafeKnigth(boolean[][] board,int r,int c){
        if(isvaid(board, r-1, c-2)){
            if(board[r-1][c-2]){
            return false;
        }}
        if(isvaid(board, r-1, c+2)){
        if(board[r-1][c+2]){
            return false;
        }}
        if(isvaid(board, r+1, c-2)){
        if(board[r+1][c-2]){
            return false;
        }}
        if(isvaid(board, r+1, c+2)){
        if(board[r+1][c+2]){
            return false;
        }}
        return true;
    }
    public static boolean isvaid(boolean[][] board,int r,int c) {
        if(r>=0 && c>=0 && r<board.length && c<board.length){
            return true;
        }
        return false;
    }
}
