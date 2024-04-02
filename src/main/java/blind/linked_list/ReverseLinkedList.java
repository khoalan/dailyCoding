package blind.linked_list;

//https://leetcode.com/problems/reverse-linked-list/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {

        return "Val= " + val + "next= "+next;
    }
 }
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        //            p
        //   <5<4<3<2<1
        //            c
        //             n

        if (head == null) return null;
        if (head.next == null ) return head;

        ListNode curr = head;
        ListNode next = head.next;
        ListNode prev = head;
        head.next = null;
        while (next!=null){
            curr = next;
            next = curr.next;
            curr.next = prev;
            prev = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2,n1);
        ListNode n3 = new ListNode(3,n2);
        ListNode n4 = new ListNode(4,n3);
        ListNode n5 = new ListNode(5,n4);

        System.out.println(reverseList(n5));
    }
}
