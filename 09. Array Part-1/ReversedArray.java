public class ReversedArray {
    public static void reverse(int numbers[]){

        int first = 0;
        int last = numbers.length-1;

        while (first < last) {
            
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {

        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverse(numbers);
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
