import java.util.Scanner;


public class LongOrShortName2 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
    
        n+='$';
        int length=0;
        while(n.charAt(length)!='$') {
            length++;
        }
        if(length<4) {
            System.out.println("Name is too short");
        }
        else {
            System.out.println("Name is too long");
        }
       
       
    }
}
