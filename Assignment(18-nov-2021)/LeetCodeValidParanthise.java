import java.util.Stack;

public class LeetCodeValidParanthise {
    public static void main(String[] args) {
        String s="{[()]}";
       System.out.println (Solution1.isValid(s));
    }
}
class Solution1 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			st.push(')');
		else if (c == '{')
			st.push('}');
		else if (c == '[')
			st.push(']');
		else if (st.isEmpty() || st.pop() != c)
			return false;
	}
	return st.isEmpty();
    }
}