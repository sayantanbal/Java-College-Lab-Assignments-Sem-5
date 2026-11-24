import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] q) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter rows and cols of 1st matrix: ");
        int r = s.nextInt(), c = s.nextInt();
        System.out.print("Enter rows and cols of 2nd matrix: ");
        int x = s.nextInt(), y = s.nextInt();

        if (c != x) {
            System.out.println("Multiplication not possible!");
            s.close();
            return;
        }

        int[][] a = new int[r][c], b = new int[x][y], z = new int[r][y];

        System.out.println("Enter 1st matrix elements:");
        read(s, a);
        System.out.println("Enter 2nd matrix elements:");
        read(s, b);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < y; j++)
                for (int k = 0; k < c; k++) z[i][j] += a[i][k] * b[k][j];

        System.out.println("Result Matrix:");
        print(z);
        s.close();
    }

    private static void read(Scanner s, int[][] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) a[i][j] = s.nextInt();
    }

    private static void print(int[][] a) {
        for (int[] row : a) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
}
