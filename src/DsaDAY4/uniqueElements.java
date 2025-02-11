package DsaDAY4;
import java.util.HashSet;
public class uniqueElements {
    public static void main(String[] args) {
            int[] arr = {3,43,234,3234,546346,463,345,523423,423,423,434,23432,55453656};
    HashSet<Integer> values = new HashSet<>();
         for(int a:arr){
             values.add(a);
         }

        System.out.println(values.getClass().getName());
    }
}
