public class LeetCodeSortingSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String s1[] =new String[s.split(" ").length];
        for(String d:s.split(" ")){
            s1[d.charAt(d.length()-1)-'1']=d.substring(0,d.length()-1);
        }
       
        return String.join(" ",s1);
        
    }
}
