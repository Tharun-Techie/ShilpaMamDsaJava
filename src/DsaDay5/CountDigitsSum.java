package DsaDay5;

import javax.swing.plaf.IconUIResource;

public class CountDigitsSum {
    public static void main(String[] args) {
        int n = 859464867;
        int cnt=0 , sum=0,rem;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            cnt++;
            n = n/10;
        }
        System.out.println("SUM "+sum);
         System.out.println("cnt "+cnt);

    }
}
