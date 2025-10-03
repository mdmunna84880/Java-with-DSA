public class Pairs {

    public static void pair(int numbers[]){

        int tp = 0;//Total number of pairs

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("("+numbers[i]+", "+numbers[j]+") ");
                tp++;
            }

            System.out.println();
        }
        
        System.out.println(tp);
    }
    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};

        pair(numbers);
    }
}
