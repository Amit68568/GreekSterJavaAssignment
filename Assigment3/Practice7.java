import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int add1=add(a1,b1);
        int mult=multiply(a1, b1);
        System.out.println("sum is " +add1);
        System.out.println("multiple is " +mult);
    }
    public static int add(int a,int b){
         return a+b;
    }

    public static int multiply(int a,int b){
        return a*b;
   }

}
