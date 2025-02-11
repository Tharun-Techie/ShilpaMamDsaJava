public class reverseaArayRecurssion {

    static void reverse(int a[],int i){
        int n = a.length;
        if (i == n/2)
            return;
        int temp =   temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;

            reverse(a,i+1);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 7, 8, 9, 4, 5};
        reverse(a,0);
        for(int arr:a){
            System.out.print(arr+"\t");
        }
    }
}
