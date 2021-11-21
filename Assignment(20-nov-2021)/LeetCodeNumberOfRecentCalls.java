import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeNumberOfRecentCalls {
    public static void main(String[] args) {
        
    }
}
// LeetCode solution
class RecentCounter {
    
   
    Queue<Integer> queue;

    public RecentCounter() {
        
        queue = new LinkedList();
    }
    
    public int ping(int t) {
      
        queue.offer(t);    
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
         
            queue.poll();
        }
        return queue.size();
    }
}