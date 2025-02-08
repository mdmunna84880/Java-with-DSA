public class ClearLastIthBit {
    public static int clearLastBit(int n, int i){
        int bitmask = (~0) << i;
        return bitmask & n;
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15, 2));
    }
}
