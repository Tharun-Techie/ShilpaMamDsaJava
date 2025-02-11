public class num_string_sep {
    public static String SeperateCharDigits(String s, int i, String digit, String nondigits){
        if(i==s.length())
            return digit+":"+nondigits;
            if(Character.isDigit(s.charAt(i)))
                digit+=s.charAt(i);
            else{
                nondigits+=s.charAt(i);
                }
            return SeperateCharDigits(s,i+1,digit,nondigits);

    }

    public static void main(String[] args) {
        String s = "b985cc47bcbfg673f2cb";
        String res =SeperateCharDigits(s,0,"","");
        System.out.println((res));
    }
}