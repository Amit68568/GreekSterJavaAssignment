import java.util.HashMap;


public class RemoveHashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");


        for (Integer s : map.keySet()) {
            if(map.get(s).equals("D")){
                map.remove(s);
                break;
            }
        }
       

        System.out.println(map);
    }
}