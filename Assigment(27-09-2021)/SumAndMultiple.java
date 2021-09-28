import java.util.Scanner;

public class SumAndMultiple {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter s for sum and m for multiplication ");

    String inp=sc.next();
    if(inp.equals("s")){
        int ad= add(a,b);
        System.out.println("The sum is = "+ad);
    }else if(inp.equals("m")){
        int mu=  multiply(a,b);
        System.out.println("The multiple is = "+mu);
    }else{
        System.out.println("Plese enter right character ");
    }
    

   
  
}
public static int add(int a1,int a2){
    return a1+a2;
}
public static int multiply(int a1,int a2){
    return a1*a2;
}
    
}