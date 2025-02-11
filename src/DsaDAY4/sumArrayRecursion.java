package DsaDAY4;

public class sumArrayRecursion {
    static int sumArray(int[] a, int ind){
        if(ind == a.length)
            return 0;
        return a[ind] + sumArray(a, ind+1);
    }

    public static void main(String[] args) {
        int[] a = {11,22,33,44,2,44};
        System.out.println("sum a array ele = "+sumArray(a,0));
    }
}
