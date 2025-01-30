package DSADay2;
import java.util.Scanner;

class Queue{
    int[] a;
    int max,front,rear;
    Queue(){
       max = 5;
       front = 0;
       rear = -1;
       a = new int[max];
    }
     void enqueue(){
        if (rear == max-1) System.out.println("Stack is Underflow");
        else {
            System.out.println("Enter the elemet");
            Scanner ob = new Scanner(System.in);
            int ele = ob.nextInt();
            rear++;
            a[rear] = ele;
        }
     }
     void dequeue(){
        if (front>rear) System.out.println("Queue is empty");
        else {
            System.out.println("deleted element = "+a[front++]);
        }
     }

     void display(){
        if(front>rear){
            System.out.println("queue is empty");
        }
        else {
            System.out.println("elemenths are :");
            for (int i = front;i<=rear;i++){
                System.out.print(a[i] + "\t");
            }
            System.out.println("");
        }
     }
}

public class pg1
{
    public static void main(String[] args) {
        Queue que = new Queue();
        while (true){
            System.out.println("1 enque 2 dequeue 3 display 4 exir");
            Scanner obj1 = new Scanner(System.in);
            int ch = obj1.nextInt();
            if (ch == 4)
                break;
            else {
                switch (ch){
                    case 1: que.enqueue();break;
                    case 2:que.dequeue();break;
                    case 3:que.display();break;
                    default: System.out.println("Invalid choice");
                }
            }
        }
    }
}
