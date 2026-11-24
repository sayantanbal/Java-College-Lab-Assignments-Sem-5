import java.util.Scanner;

public class Assignment9 {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int o = n, r = 0;
        while (n != 0) { r = r * 10 + n % 10; n /= 10; }
        return o == r;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = s.nextInt();

        System.out.println(n + (isPalindrome(n) ? " is a palindrome." : " is not a palindrome."));
        s.close();
    }
}
