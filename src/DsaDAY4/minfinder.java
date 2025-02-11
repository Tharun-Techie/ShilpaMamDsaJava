package DsaDAY4;

public class minfinder {
    public static void main(String[] args) {
        int[] a = {13,23,323,44,5,2,3,12};
        int n,min;
        min = a[0];
        for(int arr:a){
            if (min > arr){
                min = arr;
            }
        }
        System.out.println(min);
    }
}
