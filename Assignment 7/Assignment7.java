import java.util.Scanner;

class Node {
    int d;
    Node l, r;

    Node(int d) { this.d = d; }
}

class BST {
    Node r;

    void insert(int v) { r = add(r, v); }

    private Node add(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.d) n.l = add(n.l, v);
        else if (v > n.d) n.r = add(n.r, v);
        return n;
    }

    void inorder(Node n) {
        if (n != null) {
            inorder(n.l);
            System.out.print(n.d + " ");
            inorder(n.r);
        }
    }

    void preorder(Node n) {
        if (n != null) {
            System.out.print(n.d + " ");
            preorder(n.l);
            preorder(n.r);
        }
    }

    void postorder(Node n) {
        if (n != null) {
            postorder(n.l);
            postorder(n.r);
            System.out.print(n.d + " ");
        }
    }
}

public class Assignment7 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        BST t = new BST();
        System.out.print("Enter number of nodes: ");
        int n = s.nextInt();
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) t.insert(s.nextInt());

        System.out.print("\nInorder traversal (Sorted): ");
        t.inorder(t.r);
        System.out.print("\nPreorder traversal: ");
        t.preorder(t.r);
        System.out.print("\nPostorder traversal: ");
        t.postorder(t.r);
        s.close();
    }
}
