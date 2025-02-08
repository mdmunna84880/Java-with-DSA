public class NQueensCount {
    public static boolean isSafe(char board[][], int row, int col){
        // ? Vertically Up
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // ? Diagonally left up
        for(int i = row - 1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // ? Diagonally right Up
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("______Chess board______");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean nQueens(char board[][], int row){
        if(board.length == row){
            count++;
            // printBoard(board);
            return true;
        }

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'X';
            }
        }
        boolean solution = nQueens(board, 0);
        if(solution){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        // System.out.println(count);
    }
}
