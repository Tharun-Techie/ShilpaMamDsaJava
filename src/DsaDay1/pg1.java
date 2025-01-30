package DsaDay1;
import java.util.Scanner;

class Stack {
    int max;
    int top1, top2; // top1 for stack 1 (starts from the end), top2 for stack 2 (starts from the beginning)
    int[] a;

    // Constructor to initialize the stack
    public Stack() {
        max = 5;
        a = new int[max];
        top1 = max; // Stack 1 grows from the end
        top2 = -1;  // Stack 2 grows from the start
    }

    // Method to push an element onto the stack
    public void push() {
        if (top2 + 1 == top1) { // Check if the stacks are full
            System.out.println("Stack is full. Cannot push.");
        } else {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the element to push: ");
            int ele = obj.nextInt();
            System.out.println("1 for Stack 1 (top) or 2 for Stack 2 (bottom): ");
            int chInsert = obj.nextInt();

            if (chInsert == 1) { // Push to Stack 1 (top)
                top1--;
                a[top1] = ele;
                System.out.println("Pushed " + ele + " to Stack 1.");
            } else if (chInsert == 2) { // Push to Stack 2 (bottom)
                top2++;
                a[top2] = ele;
                System.out.println("Pushed " + ele + " to Stack 2.");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        Scanner obj = new Scanner(System.in);
        System.out.println("1 for Stack 1 (top) or 2 for Stack 2 (bottom): ");
        int chPop = obj.nextInt();

        if (chPop == 1) { // Pop from Stack 1
            if (top1 == max) {
                System.out.println("Stack 1 is empty. Cannot pop.");
            } else {
                int value = a[top1];
                top1++;
                System.out.println("Popped " + value + " from Stack 1.");
            }
        } else if (chPop == 2) { // Pop from Stack 2
            if (top2 == -1) {
                System.out.println("Stack 2 is empty. Cannot pop.");
            } else {
                int value = a[top2];
                top2--;
                System.out.println("Popped " + value + " from Stack 2.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method to display the stacks
    public void display() {
        if (top1 == max && top2 == -1) {
            System.out.println("Both stacks are empty.");
        } else {
            System.out.println("Elements in Stack 1 (top):");
            for (int i = max - 1; i >= top1; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            System.out.println("Elements in Stack 2 (bottom):");
            for (int i = 0; i <= top2; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

public class pg1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner obj = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("Enter 1 to Push\n2 to Pop\n3 to Display\n4 to Exit");
            System.out.print("Enter your choice: ");
            ch = obj.nextInt();

            switch (ch) {
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}