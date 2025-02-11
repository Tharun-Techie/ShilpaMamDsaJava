package DsaDAY4;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class rec3 {
    public static int sum(int n){
        if (n==1)
            return 1;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter N");
        int n = ob.nextInt();
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
        int res = sum(n);
        System.out.println((res));
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
    }
}
