package DsaDAY4;

import java.util.Scanner;

public class rec2 {
        static void printme(int n){
        if (n==0)
            return;
        printme(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter N");
        int n = ob.nextInt();
        System.out.println(" ||||||||||||||||||||||||||||||||| ");
        printme(n);
        System.out.println(" ||||||||||||||||||||||||||||||||| ");

    }
}
