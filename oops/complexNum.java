import java.util.Scanner;

class Complex{
    int real;
    int image;
    Complex(int real, int imaginary){
        this.real=real;
        this.image=imaginary;
    }
    public static void sum(Complex c1, Complex c2){
        int newReal=c1.real+c2.real;
        int newImage=c1.image+c2.image;
        System.out.println(newReal+"+"+newImage+"i");
    }
    public static void difference(Complex c1, Complex c2){
        int newReal=c1.real-c2.real;
        int newImage=c1.image-c2.image;
        System.out.println(newReal+"+"+newImage+"i");
    }
    public static void product(Complex c1, Complex c2){
        int newReal=(c1.real*c2.real)-(c1.image*c2.image);
        int newImage=(c1.image*c2.real)+(c1.real*c2.image);
        System.out.println(newReal+"+"+newImage+"i");
    }
}
public class complexNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        Complex c1= new Complex(r1, i1);
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Complex c2= new Complex(r2, i2);
        Complex.sum(c1, c2);
        Complex.difference(c1, c2);
        Complex.product(c1, c2);
    }
}
