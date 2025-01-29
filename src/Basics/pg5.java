package Basics;

public class pg5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            if (row % 2 == 0) {

                 for (int col = 1; col <= row; col++) {
                     System.out.print(col);
                 }

            } else {

                for (int col = row; col >= 1; col--) {
                    System.out.print(col);


                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}