package DsaDAY4;
import java.util.Scanner;

public class rec4 {
    static int fib(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fib(n-1)+fib(n -2);
        }

    public static void main(String[] args) {
           Scanner ob = new Scanner(System.in);
        System.out.println("Enter N");
        int n = ob.nextInt();
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
        int res = fib(n);
        System.out.println(res);
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
    }

}
