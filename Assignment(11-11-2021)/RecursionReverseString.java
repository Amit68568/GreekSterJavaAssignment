public class RecursionReverseString {
    public static void main(String[] args) {
        String s="Chirag";
        reverseString(s.toLowerCase());
    }

    private static void reverseString(String string) {
        if(string.length()==0) return;
        
        System.out.print(string.charAt(string.length()-1));
        reverseString(string.substring(0,string.length()-1));
    }
}
