import java.util.Scanner;

public class CheckAcenAndDesn {
    public static void main(String[] args) {
        check();
    }

    private static void check() {
    Scanner sc=new Scanner(System.in);
    boolean che=true;
    System.out.println("Enter the five number");
    int array[]=new int[5];
    

    for (int i = 0; i < array.length; i++) {
        array[i]=sc.nextInt();
    }
    int i;
    for (i = 0; i < array.length-1; i++) {
        if(array[i]>array[i+1]){
            System.out.println("False");
            che=false;
            break;
        }
    }
    if(che)
    {
        System.out.println("true");
    }

    }
}
