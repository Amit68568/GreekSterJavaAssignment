import java.util.Scanner;


/**
 * LongOrShortName1
 */
public class LongOrShortName1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name ");
        String s=sc.nextLine();
        if(s.length()>4){
            System.out.println("The name is too Long");
        }else{
            System.out.println("The name is too short");
        }
    
        
    }
}