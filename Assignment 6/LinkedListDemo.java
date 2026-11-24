import java.util.Scanner;

class Node {
    int d;
    Node n;

    Node(int d) { this.d = d; }
}

class MyLinkedList {
    Node h;

    void insert(int d) {
        Node x = new Node(d);
        if (h == null) { h = x; return; }
        Node p = h;
        while (p.n != null) p = p.n;
        p.n = x;
    }

    void display() {
        if (h == null) { System.out.println("List is empty"); return; }
        System.out.print("Linked List: ");
        Node p = h;
        while (p != null) {
            System.out.print(p.d + " -> ");
            p = p.n;
        }
        System.out.println("null");
    }

    void delete(int d) {
        if (h == null) return;
        if (h.d == d) { h = h.n; return; }
        Node p = h;
        while (p.n != null && p.n.d != d) p = p.n;
        if (p.n != null) p.n = p.n.n;
    }
}

public class LinkedListDemo {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        MyLinkedList l = new MyLinkedList();

        System.out.print("How many elements you want to insert: ");
        int n = s.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) l.insert(s.nextInt());

        l.display();
        System.out.print("Enter element to delete: ");
        l.delete(s.nextInt());
        System.out.println("After deletion:");
        l.display();
        s.close();
    }
}
