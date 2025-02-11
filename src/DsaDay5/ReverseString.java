package DsaDay5;

public class ReverseString {
    static String revString(String s,int i){
        if(i==-1)
            return "";
        return s.charAt(i)+revString(s,i-1);
    }

    public static void main(String[] args) {
        String a="apple", rev = "";
        rev = revString(a,a.length()-1);
        System.out.println(rev);
    }
}
