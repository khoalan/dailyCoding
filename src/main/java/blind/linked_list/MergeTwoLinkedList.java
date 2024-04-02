package blind.linked_list;

public class MergeTwoLinkedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode head = ans;

        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){
                ans.val = list1.val;
                ans.next = new ListNode();
                ans = ans.next;
                list1 = list1.next;
            }
            else {
                ans.val = list2.val;
                ans.next = new ListNode();
                ans = ans.next;
                list2 = list2.next;
            }
        }
        if (list1 == null && list2==null){
            return null;
        }
        if (list1 == null && list2!=null){
            ans.val = list2.val;
            ans.next = list2.next;
        }
        if (list2 == null && list1!=null){
            ans.val = list1.val;
            ans.next = list1.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode nn4 = new ListNode(4);
        ListNode nn3 = new ListNode(3, nn4);
        ListNode nn1 = new ListNode(1, nn3);

        System.out.println(mergeTwoLists(n1, nn1));
    }
}
