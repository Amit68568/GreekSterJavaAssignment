public class LeetCodeReversLinkedList {
    public static void main(String[] args) {
       
        Node11 n1=new Node11(1);
        Node11 n2=new Node11(2);
        Node11 n3=new Node11(3);
        Node11 n4=new Node11(4);
        Node11 n5=new Node11(5);
        Node11 n6=new Node11(6);
      

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        reverseList(n1);
        

    }
    public static Node11 reverseList(Node11 head) {
        Node11 prev=null;
        while(head!=null){
            Node11 nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
       return prev;
    }

 
        
 
}

class Node11 {
    int val;
    Node11 next;
    Node11() {}
    Node11(int val) { this.val = val; }
    Node11(int val, Node11 next) { this.val = val; this.next = next; }
}
