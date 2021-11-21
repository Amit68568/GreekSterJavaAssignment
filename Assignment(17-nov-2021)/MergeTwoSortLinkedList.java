

public class MergeTwoSortLinkedList {
    public static void main(String[] args) {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode p, d = new ListNode(0);
        p = d;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = (l1==null)?l2:l1;
        return d.next;
        }
    }
}
 class ListNode {
         int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }