package DsaDay5;

public class occerences {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8};
        int i =0;
        int cnt = 1;
        while (i<a.length){
             if (a[i] == a[i + 1]) {

            } else if (a[i] != a[i + 1])
                System.out.print(a[i]+"\t");
        }
        System.out.print(a[a.length-1]);
    }
}
