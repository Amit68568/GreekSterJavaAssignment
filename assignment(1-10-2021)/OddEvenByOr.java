import java.util.Scanner;

public class OddEvenByOr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int s=sc.nextInt();
        if((s|1)==s){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }


    }
}