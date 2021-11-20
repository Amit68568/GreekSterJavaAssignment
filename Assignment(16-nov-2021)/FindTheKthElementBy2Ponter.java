public class FindTheKthElementBy2Ponter {
    public static void main(String[] args) {
        
            Node1 n1=new Node1(4);
            Node1 n2=new Node1(6);
            Node1 n3=new Node1(8);
            Node1 n4=new Node1(2);
            Node1 n5=new Node1(7);
            Node1 n6=new Node1(1);
            Node1 n7=new Node1(0);
    
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            n5.next=n6;
            n6.next=n7;
    
            findElement(n1,4);
    }

    static void findElement(Node1 n1,int f) {
        int c=0;
        Node1 fast=n1;
        Node1 slow=n1;

        while(fast.next!=null){

           fast=fast.next;
          
           if(f-1<=c){
               slow=slow.next;
           }
           c++;
        }

        System.out.println(slow.val);


   }


}
class Node1{
    int val;
    Node1 next;

    Node1(int s){
        val=s;
       
    }

    Node1(int s,Node1 n){
        val=s;
        next=n;
    }
    Node1(){}
}