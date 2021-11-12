/**
 * Constructor1
 */
class A{
   public   A() {
        System.out.println("Class A");
    }

    void f(){
        System.out.println("fp");
    }
    void h(){
        System.out.println("hp");
    }
    void g(){
        System.out.println("gp");
    }
}

class B extends A{
public B(){
    System.out.println("Class B");

    
}

void s(){
    System.out.println("S");
}
void f(){
    System.out.println("f");
}
void t(){
    System.out.println("t");
}
}

public class Constructor1 {
public static void main(String[] args) {
    A b=new B();
    b.f();
    b.g();
}
    
}