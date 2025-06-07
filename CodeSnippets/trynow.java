import java.util.*;
public class trynow {
    public static void display(char[][] board) {
        System.out.println("-------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static boolean isFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWin(char[][] board, char value) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == value && board[i][1] == value && board[i][2] == value) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == value && board[1][j] == value && board[2][j] == value) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == value && board[1][1] == value && board[2][2] == value) ||
                (board[0][2] == value && board[1][1] == value && board[2][0] == value)) {
            return true;
        }
        return false;
    }

    public static boolean isMoveValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == ' ';
    }

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'o';
        
        while (!isFull(board)) {
            display(board);
            
            if (isWin(board, currentPlayer)) {
                System.out.println(currentPlayer + " wins");
                break;
            }

            if (currentPlayer == 'o') {
                System.out.println("Player's turn (enter row and column):");
                int row = sc.nextInt();
                int col = sc.nextInt();
                
                if (isMoveValid(board, row, col)) {
                    board[row][col] = currentPlayer;
                    currentPlayer = 'x';
                } else {
                    System.out.println("Invalid move, try again.");
                }
            } else {
                System.out.println("Computer's turn:");
                // Implement computer move logic here
                int row, col;
                do {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                } while (!isMoveValid(board, row, col));
                
                board[row][col] = currentPlayer;
                currentPlayer = 'o';
            }
        }

        display(board);
        if (!isWin(board, 'o') && !isWin(board, 'x')) {
            System.out.println("It's a draw!");
        }
    }  
}
