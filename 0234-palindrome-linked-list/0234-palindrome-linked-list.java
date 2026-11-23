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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prevNode = null;
        ListNode currNode = slow;

        while(currNode != null){
            ListNode nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        ListNode reverseHead = prevNode;

        while(reverseHead != null){

            if(head.val != reverseHead.val){
                return false;
            }

            head = head.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }
}