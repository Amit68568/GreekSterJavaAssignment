import java.util.Scanner;

public class AndOrOperation {
    public static void main(String[] args) {
        System.out.println("AND and OR BITWISE OPEARTOR");
        System.out.println("---------------------------");
        System.out.println("Enter the two number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a&b;
        int or=a|b;

        System.out.println("The AND opeartion of two number is = "+add);
        System.out.println("The OR opeartion of two number is = "+or);
    }
}
