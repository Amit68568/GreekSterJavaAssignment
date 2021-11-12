import java.util.HashMap;
public class NonrepeatingElementIsThereOrNot {
    public static void main(String[] args) {
        String s="aabcbdefdegfg";
    HashMap<Character,Integer> map=new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        if(map.containsKey(s.charAt(i))){
            Integer v=map.get(s.charAt(i));
            v++;
            map.put(s.charAt(i), v);
        }else{
            map.put(s.charAt(i), 1);
        }
        
    }
    if(map.containsValue(1)){
        for (Character c : map.keySet()) {
                 if( map.get(c)==1){
                    System.out.println("non repeating element is = "+c);
                    break;
                }
         }
        
    }else{
        System.out.println("non repeating elements not present ");
    }
    }
}
