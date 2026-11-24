class Complex {
    float re, im;

    Complex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    float modulus() {
        return (float) Math.sqrt(re * re + im * im);
    }

    void display() {
        System.out.println(re + (im >= 0 ? " + " + im : " - " + -im) + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4), c2 = new Complex(1, -2);
        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();
        System.out.print("Addition: "); c1.add(c2).display();
        System.out.print("Subtraction: "); c1.subtract(c2).display();
        System.out.print("Multiplication: "); c1.multiply(c2).display();
        System.out.println("Modulus of c1: " + c1.modulus());
        System.out.println("Modulus of c2: " + c2.modulus());
    }
}
