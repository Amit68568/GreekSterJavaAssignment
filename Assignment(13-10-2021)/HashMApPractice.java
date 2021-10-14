import java.util.HashMap;

public class HashMApPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1,"sanjay");
        m.put(2,"ashutosh");
        m.put(3,"nipun");
        m.put(4,"rabish");
        m.put(5,"akanksha");

        for(Integer s: m.keySet()){
            System.out.println(m.get(s));
        }

       
    }
}
