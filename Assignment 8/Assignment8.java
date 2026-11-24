import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String n, s, d, y, q;
    int i;

    Student(String n, int i, String s, String q) {
        this.n = n;
        this.i = i;
        this.s = s;
        d = LocalDate.now().toString();
        y = "First Year";
        this.q = q;
    }

    void display() {
        System.out.println("ID: " + i);
        System.out.println("Name: " + n);
        System.out.println("Stream: " + s);
        System.out.println("Year: " + y);
        System.out.println("Section: " + q);
        System.out.println("Date of Admission: " + d);
        System.out.println("--------------------------");
    }
}

class AdmissionSystem {
    ArrayList<Student> a = new ArrayList<>();
    int c = 101;

    void add(String n, String s, String sec) {
        a.add(new Student(n, c, s, sec));
        System.out.println("Student admitted! ID = " + c++);
    }

    void byId(int i) {
        for (Student x : a) {
            if (x.i == i) { x.display(); return; }
        }
        System.out.println("No student found with ID " + i);
    }

    void bySection(String sec) {
        boolean f = false;
        System.out.println("\nStudents of Section " + sec + ":");
        for (Student x : a) {
            if (x.q.equalsIgnoreCase(sec)) {
                x.display();
                f = true;
            }
        }
        if (!f) System.out.println("No student found in Section " + sec);
    }
}

public class Assignment8 {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        AdmissionSystem a = new AdmissionSystem();
        int c;

        do {
            System.out.println("\n--- Student Admission System ---");
            System.out.println("1. Admit Student");
            System.out.println("2. Show Student by ID");
            System.out.println("3. Show Students by Section");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            c = s.nextInt();
            s.nextLine();

            switch (c) {
                case 1:
                    System.out.print("Enter Name: ");
                    String n = s.nextLine();
                    System.out.print("Enter Stream (e.g CSE, ECE): ");
                    String st = s.nextLine();
                    System.out.print("Enter Section (e.g A, B): ");
                    a.add(n, st, s.nextLine());
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    a.byId(s.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Section: ");
                    a.bySection(s.nextLine());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (c != 4);
        s.close();
    }
}
