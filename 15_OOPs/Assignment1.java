
public class Assignment1 {
    public static void main(String[] args) {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        Complex add = Complex.add(z1, z2);
        Complex diff = Complex.diff(z1, z2);
        Complex product = Complex.product(z1, z2);

        add.print();
        diff.print();
        product.print();
    }
}

class Complex {
    int real;
    int img;
    public Complex(int real, int img){
        this.real = real;
        this.img = img;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.img+b.img));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.img-b.img));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex((a.real*b.real-a.img*b.img), (a.real*b.img+b.real*a.img));
    }

    public void print(){
        if(real != 0 && img == 0){
            System.out.println(real);
        }else if(real == 0 && img != 0){
            System.out.println(img+"i");
        }else{
            System.out.println(real+" + "+img+"i");
        }
    }
}