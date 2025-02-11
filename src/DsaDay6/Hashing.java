package DsaDay6;

import java.util.Scanner;

class Node {
    int data;
    Node down;
    RightNode right;

    // Constructor to initialize the node with a value
    Node(int ele) {
        data = ele;
        down = null;
        right = null;
    }
}

class RightNode {
    int data;
    RightNode next;

    RightNode(int ele) {
        data = ele;
        next = null;
    }
}

class Hash {
    Node headerNode;

    Hash() {
        headerNode = null;
    }

    void insert() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = ob.nextInt();
        int modval = data % 10; // Hashing function based on modulus

        Node ptr = headerNode;
        Node pp = null; // Previous pointer
        boolean found = false;

        // Traverse the linked list to find the correct bucket
        while (ptr != null) {
            pp = ptr;
            if (ptr.data % 10 == modval) {
                found = true; // Bucket found for collision resolution
                break;
            }
            ptr = ptr.down;
        }

        if (found) {
            insertRight(pp, data); // Insert in the right linked list
        } else {
            insertDown(pp, data); // Insert as a new bucket
        }
    }

    void insertRight(Node ptr, int data) {
        RightNode newNode = new RightNode(data);
        if (ptr.right == null) {
            ptr.right = newNode; // First element in the right list
        } else {
            RightNode rtptr = ptr.right;
            while (rtptr.next != null) {
                rtptr = rtptr.next; // Traverse to the end of the right list
            }
            rtptr.next = newNode; // Add new node at the end
        }
    }

    void insertDown(Node pp, int data) {
        Node newHeaderNode = new Node(data);
        if (headerNode == null) {
            headerNode = newHeaderNode; // First element in the hash table
        } else {
            pp.down = newHeaderNode; // Link to the next bucket
        }
    }

    void display() {
        if (headerNode == null) {
            System.out.println("No elements present.");
            return;
        }

        Node ptr = headerNode;

        while (ptr != null) { // Traverse each bucket in the hash table
            System.out.print(ptr.data + "\t");

            RightNode rt = ptr.right; // Start from the right linked list
            while (rt != null) { // Traverse through right linked list
                System.out.print(rt.data + "\t");
                rt = rt.next; // Move to next node in right list
            }

            System.out.println(); // New line after each bucket's contents
            ptr = ptr.down; // Move to the next bucket in the hash table
        }
    }
}

public class Hashing {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        Hash hsh = new Hash(); // No size parameter needed for this implementation

        int ch;

        while (true) {
            System.out.println("1: Insert");
            System.out.println("2: Display");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");
            ch = ob.nextInt();

            if (ch == 3) {
                break; // Exit the loop
            } else if (ch == 1) {
                hsh.insert(); // Call insert method directly
            } else if (ch == 2) {
                hsh.display();
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        ob.close(); // Close the scanner resource
    }
}
