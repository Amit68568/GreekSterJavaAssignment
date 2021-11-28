import javax.xml.transform.stream.StreamSource;

public class CycleDetectionInLnkedList {
    public static void main(String[] args) {
        
        child c=new child();
        c.fun();
    }
}

abstract class  Bank {
    public  void hello(){
        System.out.println("hello");
    }

   abstract public void  fun();

    
} 


class child extends Bank{
   public void fun(){
       System.out.println("fun");
   }
}