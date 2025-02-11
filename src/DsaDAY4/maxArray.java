package DsaDAY4;

public class maxArray {
        public static int maximum(int[] a, int max,int ind){
        if(ind == a.length)
            return max;
        if(a[ind]>max)
            max = a[ind];
        return maximum(a,max,ind+1);
    }

    public static void main(String[] args) {
         int[] a = {324,123,34,431,2,332};
        System.out.println(("maximum "+maximum(a,a[0],1)));
    }
}
