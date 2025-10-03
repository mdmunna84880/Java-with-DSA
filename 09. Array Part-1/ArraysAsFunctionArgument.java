import java.util.Scanner;

public class ArraysAsFunctionArgument {
    public static void update( int marks[], int nonChangeable){
        nonChangeable = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[3];
        int nonChangeable = 5;
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        sc. close();

        update(marks, nonChangeable);
        
        System.out.println(nonChangeable);
        for(int i = 0; i < marks.length; i++){
            System.out.println("Marks"+i+" = " + marks[i]);
        }
    }
}
