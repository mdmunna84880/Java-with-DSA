public class DecimalToBinary {
    public static int binaryNo(int deciNo){
        int pow = 0; 
        int binNo = 0;
        while(deciNo > 0){
            int remain = deciNo % 2;
            binNo += remain * (int)Math.pow(10, pow);
            deciNo /= 2;
            pow++;
        }
        return binNo;
    }
    public static void main(String[] args) {
        System.out.println(binaryNo(15));
    }
}
