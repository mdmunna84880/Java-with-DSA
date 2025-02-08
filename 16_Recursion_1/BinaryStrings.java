public class BinaryStrings {
    public static void binaryString(int n, String str, int last){
        if(n == 0){
            System.out.println(str);
            return;
        }
        binaryString(n-1, str+"0", 0);
        if(last == 0){
            binaryString(n-1, str+"1", 1);
        }
    }

    public static void main(String[] args) {
        binaryString(3, "", 0);
    }
}
