package DsaDAY4;

import java.util.Scanner;

public class recursion1 {
    static void printme(int n){
        if (n==0)
            return;
        System.out.println(n);
        printme(n-1);

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
