public class SudokoSolver {
    public static void printSudoko(int sudoko[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int sudoko[][], int digit, int row, int col){
        // ? Column Check
        for(int i = 0; i < 9; i++){
            if(sudoko[i][col] == digit){
                return false;
            }
        }

        // ? Row Check
        for(int j = 0; j < 9; j++){
            if(sudoko[row][j] == digit){
                return false;
            }
        }

        // ? Grid Check
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(sudoko[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean sudukoSolver(int sudoko[][], int row, int col){
        // ? Base Case
        if(row == 9){
            return true;
        }

        int nexRow = row;
        int nextCol = col+1;
        if(nextCol == 9){
            nextCol = 0;
            nexRow = row+1;
        }
        if(sudoko[row][col] != 0){
            return sudukoSolver(sudoko, nexRow, nextCol);
        }
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoko, digit, row, col)){
                sudoko[row][col] = digit;
                if(sudukoSolver(sudoko, nexRow, nextCol)){
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int sudoko[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if(sudukoSolver(sudoko, 0, 0)){
            System.out.println("The solution is exist");
            printSudoko(sudoko);
        }else{
            System.out.println("Not found");
        }
    }
}
