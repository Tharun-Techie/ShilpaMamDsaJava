package Basics;

public class pg6 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1;row<=n;row++){
            for(int col = n;col>=row;col--){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
