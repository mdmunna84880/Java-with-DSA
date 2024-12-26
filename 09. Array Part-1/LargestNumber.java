public class LargestNumber {
    public static int largestN(int numbers[], int largest, int smallest){
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int numbers[] = {1, 2, 6, 3, 5, 4};
        System.out.println("The largest is "+largestN(numbers, largest, smallest));
    }
}
