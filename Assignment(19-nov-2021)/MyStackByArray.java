import javax.print.FlavorException;

public class MyStackByArray {

    int a[];
    int top=-1;
    int cap;
    

    MyStackByArray(){

    }
     MyStackByArray(int c){
        a=new int[c];
        cap=c;
    }

    void push(int x){
        if(top==cap-1){
            System.out.println("Stack is full");
        }else{
            top++;
            a[top]=x;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{
            int t=a[top];
            top--;
            return t;
        }
        return -1;
    }
    int peek(){
      return a[top];  
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
           return false;
        }
    }

    int getAvg(){
        int sum=0;
        for (int i = 0; i <= top; i++) {
            sum=sum+a[i];
        }
        int avg=sum/(top+1);
       
        
        return avg;

    }
    int getMax(){
      
        int max=a[1];
        int i=0;
        while (i<=top) {
            if(max<a[i]){
                max=a[i];
               
        }
        i++;
    }
        return max;
    }
    public static void main(String[] args) {
        MyStackByArray s1=new MyStackByArray(10);
        s1.push(10);
        s1.push(11);
        s1.push(12);
        s1.push(13);
        s1.push(14);
      System.out.println(s1.getAvg());  
      System.out.println(s1.getMax());  
      System.out.println(s1.peek());  
      System.out.println(s1.pop());  
      System.out.println(s1.peek());  
      System.out.println(s1.pop());  
    }
}
