package ExamProblems;
import java.util.Scanner;
public class minMaxInaarray {

    static void finder(int[] arr){
        int min = arr[0];
        int max = arr[0];

//        for (int a : arr) {
//            if (a > max)
//                max = a;
//            if (a < min)
//                min = a;
//        }

        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min value is: "+min);
        System.out.println("Max value is: "+max);
    }


    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ob.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0;i<n;i++){
            arr[i] = ob.nextInt();
        }
        finder(arr);
    }
}