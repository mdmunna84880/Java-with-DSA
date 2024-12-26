public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= line; star++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
