package DsaDAY4;


import java.util.Scanner;


class Node{
    int data;
    Node prev, next;
    Node(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Data :");
        data = obj.nextInt();
        prev = null;
        next = null;
    }

}

public class DLL {

    Node head;
    int count;

    DLL() {
        head = null;
        count = 0;
    }

    void insertBeginning() {
        Node newNode = new Node();
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    void insertEnd() {
    Node newNode = new Node();
    if (head == null)
        head = newNode;
    else {
        Node ptr;
        for(ptr=head;ptr.next!=null;ptr=ptr.next);
        ptr.next = newNode;
    }
    count++;
    }

    void insertPos() {
    Scanner ob = new Scanner(System.in);
        System.out.println("Enetr pos=");
        int pos = ob.nextInt();
        if(pos<1 || pos>count+1){
            System.out.println("Invalid pos");
        }
        else if(pos == 1)
            insertBeginning();
        else if (pos == count+1) {
            insertEnd();
        }
        else {
            Node newNode =new Node();
            Node cp , pp;
            pp =head;
            cp = head;

        }
    }

    void deleteBeginning() {


    }

    void deleteEnd() {
        if (head == null)
            System.out.println("Epty list re");
        else{
            Node pp, cp;
            for(pp=head,cp=head;cp.next!=null;pp=cp,cp=cp.next);
            System.out.println("deleting"+cp.data);
            if (count==1)
                head =null;
            else
                pp.next = null;
            count--;
        }

    }

    void display() {
        if (head == null)
            System.out.println("List is empty");
        else {
            System.out.println("list elements");
            Node ptr = head;
            while (ptr.next != null) {
                System.out.print("elements:" + ptr.data);
                ptr = ptr.next;
            }
            System.out.println();
        }
    }

    void deletePos(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter pos=");
        int pos = ob.nextInt();
        if(pos<1 || pos>count)
            System.out.println("Invalid Pos");
        else if(pos ==1)
            deleteBeginning();
        else if(pos == count)
            deleteEnd();
        else {
            Node pp,cp;
            int i;
            for(i=1,pp=head,cp=head;i<pos;pp=cp,cp=cp.next);
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
    }


    public static void main(String[] args) {
        DLL s = new DLL();
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
                    s.insertBeginning();
                    break;
                case 2:
                    System.out.print("Enter element to insert at end: ");
                    s.insertEnd();
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
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        ob.close();
    }
}
