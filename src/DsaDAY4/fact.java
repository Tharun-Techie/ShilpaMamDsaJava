package DsaDAY4;
import java.util.Scanner;
public class fact {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        else {
            return n * fact(n - 1);

        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter N");
        int n = ob.nextInt();
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
        int res = fact(n);
        System.out.println(res);
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
    }
}