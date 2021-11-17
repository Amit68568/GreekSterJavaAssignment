import java.util.Arrays;

public class LeetCodeValidAnagram {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
       System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char []a1=s.toCharArray();
        char []a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            return true;
        }else{
            return false;
        }
        
    }
}
