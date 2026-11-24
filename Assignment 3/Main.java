import java.util.Scanner;
import java.util.Arrays;

class Search {

    // 1. Linear Search: returns first index of key, else -1
    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }

    // 2. Binary Search: array must be sorted. returns index of key, else -1
    public static int binSearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Linear Search works on unsorted array
        int linearIndex = Search.linearSearch(arr, key);
        if(linearIndex!= -1)
            System.out.println("Linear Search: Found at index " + linearIndex);
        else
            System.out.println("Linear Search: Element not found");

        // Binary Search requires sorted array
        Arrays.sort(arr); // sort first
        System.out.println("Sorted array for Binary Search: " + Arrays.toString(arr));

        int binaryIndex = Search.binSearch(arr, key);
        if(binaryIndex!= -1)
            System.out.println("Binary Search: Found at index " + binaryIndex);
        else
            System.out.println("Binary Search: Element not found");

        sc.close();
    }
}