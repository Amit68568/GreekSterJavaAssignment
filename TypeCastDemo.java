import java.util.Scanner;

public class TypeCastDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1= (int)sc.nextFloat();
        int i2=(int)sc.nextDouble();
        double d1=sc.nextInt();
        double d2=(double)sc.nextLong();
        float f1=sc.nextInt();
        float f2=(float)sc.nextLong();
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println(f2);
        
        
        
    }
    
}
