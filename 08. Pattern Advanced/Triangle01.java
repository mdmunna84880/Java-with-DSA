public class Triangle01 {
    public static void triangle01(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                // ? First way
                // if(((i % 2) != 0  && (j % 2) != 0 ) || (i%2 == 0) && (j%2 == 0)){
                //     System.out.print("1 ");
                // }else{
                //     System.out.print("1 ");
                // }

                // ? Second Way
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle01(5);
    }
}
