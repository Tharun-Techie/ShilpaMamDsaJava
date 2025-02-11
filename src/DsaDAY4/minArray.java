package DsaDAY4;

public class minArray {
    public static int minimum(int[] a, int min,int ind){
        if(ind == a.length)
            return min;
        if(a[ind]<min)
            min = a[ind];
        return minimum(a,min,ind+1);
    }

    public static void main(String[] args) {
        int[] a = {324,123,34,431,2,332};
        System.out.println(("mininum "+minimum(a,a[0],1)));
    }
}
