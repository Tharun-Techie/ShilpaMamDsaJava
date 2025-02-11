package DsaDay5;

public class arrayReverse {

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 7, 8, 9, 4, 5};
        int n = a.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for(int arr:a){
            System.out.println(arr);
        }
    }
}
