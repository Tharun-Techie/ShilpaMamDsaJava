package DsaDay5;

public class CountDigitsSumRecurssion {
    static int count(int n){
        if (n==0)
           return 0;
        return 1+count(n/10);
    }

    static int sum(int n){
            if(n==0)
                return 0;
        return (n%10)+sum(n/10);
    }

    public static void main(String[] args) {
        int  n = 31267188;
        int cnt = count(n);
        int sum = sum(n);
        System.out.println("Sum: "+sum);
        System.out.println("Count is:"+cnt);


    }
}
