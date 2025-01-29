package DsaDay1;
import java.util.Scanner;

class Stack {
    private int max; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] a; // Array to store stack elements

    // Constructor to initialize the stack
    public Stack() {
        max = 5;
        a = new int[max];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push() {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the element to push: ");
            int value = obj.nextInt();
            a[++top] = value; // Increment top and insert the value
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int value = a[top--]; // Decrement top and return the value
            System.out.println("Popped " + value + " from the stack.");
        }
    }

    // Method to display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == max - 1);
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