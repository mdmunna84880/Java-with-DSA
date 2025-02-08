public class UpdateIthBit {
    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateBit(int n, int i, int newBit){
        n = clearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
    }
}
