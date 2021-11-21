import java.util.Stack;

public class ReverseStringByStack {
    public static void main(String[] args) {
      
          
                String s = "Hi I am Amit";
                String[] arr = s.split(" ");
                Stack<String> stk = new Stack<>();
                for(int i=0; i<arr.length; i++) {
                    stk.push(arr[i]);
                }
               
                for(int i=0; i<arr.length; i++) {
                 System.out.print( stk.pop()+" ");
                }
               
            
        
        

        
    }
}
