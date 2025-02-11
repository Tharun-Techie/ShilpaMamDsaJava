package DsaDAY4;

public class fibSeries {
    static int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void fibseries(int n){
        if(n==0)
            return;
        fibseries(n-1);
        System.out.println(fib(n));

    }

    public static void main(String[] args) {
        int n = 30;
        fibseries(n);
    }
}
