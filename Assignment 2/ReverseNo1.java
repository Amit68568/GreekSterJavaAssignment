import java.util.Scanner;

public class ReverseNo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to be reverse");
        int s=sc.nextInt();
        int rev=0;
        while(s>0){
            int t=s%10;
            rev=(rev*10)+t;
            s=s/10;
        }
        System.out.println("The reverse number is "+rev);
    }
}
