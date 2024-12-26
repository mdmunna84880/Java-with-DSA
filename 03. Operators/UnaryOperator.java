public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);//11
        System.out.println(b);//11
        int c = 10;
        int d = c++;
        System.out.println(c);//11
        System.out.println(d);//10
        int e = 10;
        int f = --e;
        System.out.println(e);//9
        System.out.println(f);//9
        int g = 10;
        int h = g--;
        System.out.println(g);//9
        System.out.println(h);//10
    }
}
