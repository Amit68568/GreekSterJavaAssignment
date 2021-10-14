import java.util.HashMap;
public class CountCharByHash {

    public static void main(String[] args) {
        String s="tit is not a god boy";

        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c=s.charAt(i);
            if(c>='a'&& c<='z'){
            if(map.containsKey(c)){
                Integer value=map.get(c);
                value++;
                map.put(c, value++);

            }else{
                map.put(c, 1);
            }
        }}
        
    
    }
}