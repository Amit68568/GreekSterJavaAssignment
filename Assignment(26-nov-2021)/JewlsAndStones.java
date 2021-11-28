package Assignment(25-nov-2021);

public class JewlsAndStones {
    public int numJewelsInStones(String J, String S) {
        //Make HasSet
        HashSet<Character> jewels = new HashSet<>();
        
        for(int i=0; i<J.length(); i++){
            char c = J.charAt(i);
            if(!jewels.contains(c)){
                jewels.add(c);
            }
        }
        
        int res=0;
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(jewels.contains(c)){
                res++;
            }
        }
        return res;
    }
}
