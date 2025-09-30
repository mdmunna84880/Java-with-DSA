public class KadansWithOnlyNegative {
    public static int kadanes(int []numbers){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        return ms;
    }
    public static int kadanesNegative(int numbers[]){
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                return  ms = kadanes(numbers);
            }else{
                ms = Math.max(ms, numbers[i]);
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -5};
        int ms = kadanesNegative(numbers);
        System.out.println("The maximum sum of sub-arrays are "+ms);
    }
}
