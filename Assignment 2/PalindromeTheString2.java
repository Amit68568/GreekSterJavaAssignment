import java.util.Scanner;

public class PalindromeTheString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
		String input1 = sc.nextLine();
		boolean bol = true;
		input1 = input1.toLowerCase();
		
		int n = input1.length();
		for(int i=0; i<n; i++) {
			
			if(input1.charAt(i) != input1.charAt(n-i-1)) {
				bol = false;
				break;
			}
			
		}
		
		if(bol) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String  is not a Palindrome");
		}



    }
}
