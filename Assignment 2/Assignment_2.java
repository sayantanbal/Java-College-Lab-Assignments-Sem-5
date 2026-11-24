import java.util.Scanner;

class Until {

    // Function to calculate average
    public float Avg(int arr[], int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (float) sum / n; // typecast to float
    }

    // Function to find maximum
    public int Max(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Function to find minimum
    public int Min(int arr[], int n) {
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Until obj = new Until(); // create object

        System.out.println("\nAverage = " + obj.Avg(arr, n));
        System.out.println("Maximum = " + obj.Max(arr, n));
        System.out.println("Minimum = " + obj.Min(arr, n));

        sc.close();
    }
}