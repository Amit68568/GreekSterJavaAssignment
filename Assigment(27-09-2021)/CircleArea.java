import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int s=sc.nextInt();
        System.out.println("What operation would you like to do Area and perimeter");
        System.out.println("Enter a for area and c for perimeter");

        String inp=sc.next();
    if(inp.equals("a")){
        double ad= area(s);
        System.out.println("The area is = "+ad);
    }else if(inp.equals("c")){
        double mu=  cirumference(s);
        System.out.println("The perimeter is = "+mu);
    }else{
        System.out.println("Plese enter right character ");
    }
        

    }
    public static double area(int r){
        return 3.14*r*r;
    }
    public static double cirumference(int r){
        return 2*3.14*r;
    }
    
}
