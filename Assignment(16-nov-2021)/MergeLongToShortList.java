public class MergeLongToShortList {
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

        Node1 x1=new Node1(4);
        Node1 x2=new Node1(6);
        Node1 x3=new Node1(8);
        Node1 x4=new Node1(2);
       

        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
       

        mergeLongtosort(n1,x1);
    }

    private static void mergeLongtosort(Node1 n1, Node1 i) {
        Node1 f1=n1;
        int f1co=1;
        int f2co=1;
        Node1 f2=i;

        while(f1.next!=null){
            f1=f1.next;
            f1co++;
        }

        while(f2!=null){
            f2=f2.next;
            f2co++;
        }

        if(f1co>f2co){
            f1.next=i;
            while(n1!=null){
                System.out.println(n1.val);
                n1=n1.next;
            }
        }else{
            f2.next=n1;
        }
    }
}
