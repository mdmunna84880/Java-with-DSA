// ! I do not understand it properly.
public class Assignment1 {
    public static void printMaze(int maze[][]){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze.length; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int row, int col){
        return row < maze.length && row >= 0 && col < maze.length && col >= 0 && maze[row][col] == 1;
    }

    public static boolean solveMazeUtil(int maze[][], int sol[][], int row, int col){
        if(maze.length-1 == row && maze.length-1 == col && maze[row][col] == 1){
            sol[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row, col)){
            if(sol[row][col] == 1){
                return false;
            }
            sol[row][col] = 1;
            if(solveMazeUtil(maze, sol, row+1, col)){
                return true;
            }
            if(solveMazeUtil(maze, sol, row, col+1)){
                return true;
            }
            sol[row][col] = 0;
            return false;
        }
        return false;
    }

    public static boolean solveMaze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int [n][n];
        if(solveMazeUtil(maze, sol, 0, 0) == false){
            System.out.println("Solution does not found");
            return false;
        }
        printMaze(sol);
        return true;
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        solveMaze(maze);
    }
}
