/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;

        if (list1 == null && list2 == null) {
            return head;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode nextNode = head;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                nextNode.next = list1;
                nextNode = nextNode.next;
                list1 = list1.next;
            } else {
                nextNode.next = list2;
                nextNode = nextNode.next;
                list2 = list2.next;
            }
        }

        nextNode.next = list1 == null ? list2 : list1;

        return head;
    }
}