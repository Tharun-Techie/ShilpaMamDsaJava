package DsaDay1;
import java.util.Scanner;

class Stack {
     int max;
     int top1,top2; // Index of the top element
     int[] a;
    // Constructor to initialize the stack
    public Stack() {
        max = 5;
        a = new int[max];
        top1 = max;
        top2 = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push() {
        if(top1-top2 == 1){
            System.out.println("stack is full");
        }
        else {
            Scanner obj = new Scanner(System.in);
            int ele = obj.nextInt();
            System.out.println("1 for top 2 for bottom");
            int chInsert = obj.nextInt();
            if (chInsert == 1){
                top1--;
                a[top1]= ele;
            }
            else if (chInsert ==2) {
                top2++;
                a[top2] = ele;
            }
            else
                System.out.println("Invalid cchoice");
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
        if(top1 == max && top2==1){
            System.out.println("Stack is empty");
        }
        System.out.println("stack of the elements are :");
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