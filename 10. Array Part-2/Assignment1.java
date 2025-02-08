public class Assignment1 {
    public static boolean repeatedNum(int []numbers){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] numbers = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(repeatedNum(numbers));
    }
}
