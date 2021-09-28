import java.util.Scanner;

public class Practce6 {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean d=checkAge(age);
        if(d){
            System.out.println("Person can vote");
          }else{
              System.out.println("Person cannot vote");
          }
         
        
    }
    static boolean checkAge(int n){
        if(n>18){
            return true;
        }else{
            return false;
        }
    }
     
   
    
}
