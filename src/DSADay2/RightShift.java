package DSADay2;

public class RightShift {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int len = a.length;
        int temp = a[len-1];
        for (int i = len-1;i>=1;i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");

        }
    }
}
