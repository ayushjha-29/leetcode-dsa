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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int len = 1;
        ListNode currNode = head;

        while(currNode.next != null){
            len++;
            currNode = currNode.next;
        }

        k = k % len;

        if(k == 0){
            return head;
        }

        currNode.next = head;

        for(int i=1 ; i<len - k; i++){
            head = head.next;
        }

        ListNode newHead = head.next;
        head.next = null;

        return newHead; 
    }
}