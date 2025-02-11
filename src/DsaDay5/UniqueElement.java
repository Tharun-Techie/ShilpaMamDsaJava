package DsaDay5;

public class UniqueElement {
    public static final java.io.PrintStream OUT = System.out;

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8};
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i + 1]) {
                i++;
            } else if (a[i] != a[i + 1])
                System.out.print(a[i]+"\t");
        }
        System.out.print(a[a.length-1]);

    }
}
