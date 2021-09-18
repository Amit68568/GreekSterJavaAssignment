import java.util.Scanner;

/**
 * PalindromeTheString1
 */
public class PalindromeTheString1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("The String is Palindrome ");
        }else{
            System.out.println("The String is not Palindrime");
        }

    }
}