package Basics;

public class pg4 {
    public static void main(String[] args) {
        int n = 10;
        //1
        //12
        //1 3
        //1  4
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
