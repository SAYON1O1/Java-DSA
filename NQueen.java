public class NQueen {
    static final int N = 5;
    public static int count = 0 ;
 
    static void printBoard(char board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%c ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
 
    static boolean isSafe(char board[][], int row, int col) {
        int i, j;
 
        // Check this row on left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 'Q')
                return false;
 
        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;
 
        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 'Q')
                return false;
 
        return true;
    }
 
    static void solveNQueens(char board[][], int col) {
        // Base case: If all queens are placed
        // then return true
        if (col == N){
            printBoard(board);
            count++;
            return;
        }
        // Consider this column and try placing
        // this queen in all rows one by one
        for (int i = 0; i < N; i++) {
 
            // Check if the queen can be placed on
            // board[i][col]
            if (isSafe(board, i, col)) {
 
                // Place this queen in board[i][col]
                board[i][col] = 'Q';
 
                // Recur to place rest of the queens
                solveNQueens(board, col + 1);
 
                // If placing queen in board[i][col]
                // doesn't lead to a solution then
                // remove queen from board[i][col]
                board[i][col] = '.'; // BACKTRACK
            }
        }
    }
 
    static void fillBoard(char board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }
    }
 
    public static void main(String[] args) {
        char board[][] = new char[N][N];
        fillBoard(board);
        solveNQueens(board, 0);
        System.out.println("total number of ways: "+count);
    }
}
    

