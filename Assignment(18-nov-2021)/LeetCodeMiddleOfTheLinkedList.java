public class LeetCodeMiddleOfTheLinkedList {

   
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

        Solution.middleNode(n1);
        
    }
}

class Solution {
    public static Node1 middleNode(Node1 head) {
        Node1 slow = head;
        Node1 fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}