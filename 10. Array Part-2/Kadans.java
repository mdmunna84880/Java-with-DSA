public class Kadans {
    public static void Kadanes(int []numbers){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The max sum of sub-arrays are "+ms);
    }
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5,-3};
        Kadanes(numbers);
    }
}
