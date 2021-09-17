
public class A{

public static void main(String[] args) {
    B b=new B();
    int add =b.add(5, 6);

    int addStatic=B.addStatic(5, 6);

    System.out.println(add);
    System.out.println(addStatic);

}

}