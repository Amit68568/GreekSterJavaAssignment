import java.util.HashMap;

/**
 * NonRepeatingElement
 */
public class NonRepeatingElement {
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
        System.out.println("non repeating element = ");
    }
    // for (Character c : map.keySet()) {
    //     if( map.get(c)==1){
    //         System.out.println("non repeating element = "+c);
    //         break;
    //     }
    //  }
    
}
    
}