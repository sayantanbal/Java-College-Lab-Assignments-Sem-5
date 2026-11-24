import java.util.Scanner;

class Stack {
    private final int[] a;
    private int t = -1;

    Stack(int n) { a = new int[n]; }

    boolean empty() { return t == -1; }

    boolean full() { return t == a.length - 1; }

    void push(int v) {
        if (full()) { System.out.println("Stack overflow."); return; }
        a[++t] = v;
        System.out.println(v + " pushed onto the stack.");
    }

    void pop() {
        if (empty()) { System.out.println("Stack underflow."); return; }
        System.out.println(a[t--] + " popped from the stack.");
    }

    void peek() {
        if (empty()) { System.out.println("Stack is empty."); return; }
        System.out.println("Top element: " + a[t]);
    }

    void display() {
        if (empty()) { System.out.println("Stack is empty."); return; }
        System.out.print("Stack: ");
        for (int i = t; i >= 0; i--) System.out.print(a[i] + " ");
        System.out.println();
    }
}

public class Assignment10 {
    public static void main(String[] q) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        Stack a = new Stack(s.nextInt());
        int c;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter choice: ");
            c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter value: ");
                    a.push(s.nextInt());
                    break;
                case 2:
                    a.pop();
                    break;
                case 3:
                    a.peek();
                    break;
                case 4:
                    a.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (c != 5);
        s.close();
    }
}
