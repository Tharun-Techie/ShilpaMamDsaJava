package DSADay2;

import java.util.Scanner;
import java.util.SortedMap;

class MyaArry {
    int[] a;
    int max;
    int p;

    MyaArry() {
        p = -1;
        max = 10;
        a = new int[max];
    }

    void insertBegin() {
        if (p == max - 1) {
            System.out.println("We cannot insert");
        } else {
            for (int i = p + 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter elements");
            int ele = ob.nextInt();
            a[0] = ele;
            p++;
        }
    }
    void deleteBegin() {
        if(p==-1)
            System.out.println("Cannot delete - array empty");
    else {
            System.out.println("Deleting ... =" + a[0]);
            for (int i =0;i<p;i++)
                a[i] = a[i+1];
            a[p] = 0;
            p--;
        }
    }
    void insertEnd() {
        if (p == max - 1) {
            System.out.println("We cannot insert");
        } else {
            p++;
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter The Elements");
            int ele = ob.nextInt();
            a[p] = ele;
        }
    }

    void display() {
        System.out.println("Elements are");
        for (int i = 0; i <= p; i++)
            System.out.print(a[i] + "\t");
        System.out.println();
    }

    void insertAtPosition() {
        System.out.println("Enter the position");
        Scanner ob = new Scanner(System.in);
        int pos = ob.nextInt();
        if (pos ==0){
            insertBegin();}
        else if (pos == p+1) {
            insertEnd();}
        else {
            for (int i =p+1;i>pos;i--) {
                a[i] = a[i - 1];
            }
            System.out.println("enter ele");
            int elee = ob.nextInt();
            a[pos] = elee;
            p++;


        }
    }

    void message() {
        System.out.println("1. Insert in beginning");
        System.out.println("2. Insert in end");
        System.out.println("3. Insert at position");
        System.out.println("4. Delete in beginning");
        System.out.println("5. Delete at end");
        System.out.println("6. Delete at position");
        System.out.println("7. Display");
        System.out.println("8. Exit");
    }
}

public class ArayAlinOne {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        MyaArry arr = new MyaArry();

        while (true) {
            arr.message();
            System.out.println("Enter the choice");
            int ch = ob.nextInt();

            if (ch == 8)
                break;

            switch (ch) {
                case 1:
                    arr.insertBegin();
                    break;
                case  2:
                    arr.insertEnd();
                    break;
                case 3:
                    arr.insertAtPosition();
                case 4:
                    arr.deleteBegin();
                case 7:
                    arr.display();
                    break;
                default:
                    break;
            }
        }
    }
}
