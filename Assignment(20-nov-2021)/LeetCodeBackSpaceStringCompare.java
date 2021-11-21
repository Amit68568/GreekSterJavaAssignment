import java.util.Stack;

public class LeetCodeBackSpaceStringCompare {
    public static void main(String[] args) {
        String s="ab#c",t="ad#c";
       System.out.println(backspaceCompare(s, t)); 
    }

    public static boolean backspaceCompare(String S, String T) {
        return stackSolution(S).equals(stackSolution(T));
    }
    
    private static String stackSolution(String str) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : str.toCharArray()) {
		
            if (c != '#') {
                stack.push(c);
				
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }
}


