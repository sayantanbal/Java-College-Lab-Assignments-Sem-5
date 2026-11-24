import java.util.Scanner;

public class Assignment5 {
    static int rev(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = s.nextInt();

        System.out.println("Reversed number: " + rev(n));
        System.out.println(n + (prime(n)
                ? " is a Prime number"
                : " is NOT a Prime number"));
        s.close();
    }
}
