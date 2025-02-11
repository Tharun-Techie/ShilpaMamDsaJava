package DSADay3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SSL {
    int count;
    Node head;

    SSL() {
        head = null;
        count = 0;
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
        count++;
    }

    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            count--;
        }
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            System.out.println("Deleting: " + head.data);
            head = null;
            count--;
        } else {
            Node pp = head; // Previous pointer
            Node cp = head.next; // Current pointer
            while (cp.next != null) {
                pp = cp;
                cp = cp.next;
            }
            System.out.println("Deleting: " + cp.data);
            pp.next = null; // Remove last node
            count--;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println("List Elements:");
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.data + "\t");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }

    public static void message() {
        System.out.println("1: Insert at beginning");
        System.out.println("2: Insert at end");
        System.out.println("3: Delete at beginning");
        System.out.println("4: Delete at end");
        System.out.println("5: Display");
        System.out.println("6: Insert at position");
        System.out.println("7: Exit");
        System.out.println("8 Reverse");
        System.out.println("10 exit");
    }

    void insertPos() {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the element to insert: ");
        int data = ob.nextInt();

        System.out.print("Enter position to insert at: ");
        int pos = ob.nextInt();

        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid position");
            return; // Exit the method if the position is invalid
        }

        if (pos == 1) {
            insertBeginning(data);
        } else if (pos == count + 1) {
            insertEnd(data);
        } else {
            Node newNode = new Node(data);
            Node ptr = head;
            for (int i = 1; i < pos - 1; i++) { // Traverse to the position before where we want to insert
                ptr = ptr.next;
            }
            newNode.next = ptr.next; // Link new node to the next node
            ptr.next = newNode; // Link previous node to the new node
            count++;
        }
    }

    void reverse(Node ptr){
        if(ptr == null)
            return;
        reverse(ptr.next);
        System.out.print(ptr.data+"--->");
    }

    public static void main(String[] args) {
        SSL s = new SSL();
        Scanner ob = new Scanner(System.in);

        while (true) {
            message();
            System.out.print("Enter choice: ");
            int ch = ob.nextInt();

            if (ch == 7)
                break;

            switch (ch) {
                case 1:
                    System.out.print("Enter element to insert at beginning: ");
                    s.insertBeginning(ob.nextInt());
                    break;
                case 2:
                    System.out.print("Enter element to insert at end: ");
                    s.insertEnd(ob.nextInt());
                    break;
                case 3:
                    s.deleteBeginning();
                    break;
                case 4:
                    s.deleteEnd();
                    break;
                case 5:
                    s.display();
                    break;
                case 6:
                    s.insertPos();
                    break;
                case 8:
                    System.out.println("Reversed List");
                    s.reverse(s.head);break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        ob.close();
    }
}
