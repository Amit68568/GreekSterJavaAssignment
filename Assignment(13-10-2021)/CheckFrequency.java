import java.util.HashMap;

public class CheckFrequency {
    public static void main(String[] args) {
        HashMap<Character,Integer> s=new HashMap<>();
        String h="aaabbbcccddeeeffffksacd";
        for (int i = 0; i < h.length(); i++) {
            if(s.containsKey(h.charAt(i))){
                Integer v=s.get(h.charAt(i));
                v++;
                s.put(h.charAt(i), v);
            }else{
                s.put(h.charAt(i), 1);
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Character cmax=0;
        Character cmin=0;
        for (Character c : s.keySet()) {
            if(max<s.get(c)){
                max=s.get(c);
                cmax=c;

            }
            if(min>s.get(c)){
                min=s.get(c);
                cmin=c;
            }
            System.out.println(c+" = "+s.get(c));
        }

        
        System.out.println(cmax+ " is maximum Occurance = "+max);
        System.out.println(cmin+" is minimum Occurance = "+min);

    }
}
