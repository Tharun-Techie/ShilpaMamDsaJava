package DSADay2;
import java.util.Scanner;
public class pg3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int temp = 0;

        Scanner ob = new Scanner(System.in);
        System.out.println("enter the no of shifts");
        int shift = ob.nextInt();

        for (int j = 1; j <= shift ; j++) {
             temp = a[0];
        for (int i = 0; i < a.length-1 ; i++) {
            a[i] = a[i+1];
        }
        a[a.length-1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");

        }
    }
}
