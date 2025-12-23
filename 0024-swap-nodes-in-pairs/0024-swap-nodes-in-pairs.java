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
    public ListNode swapPairs(ListNode head) {
        // if head is null OR just having a single node, then no need to change anything 
        if(head == null || head.next == null) 
        {
            return head;
        }

        ListNode temp = head.next; //Initialize temp to head.next

        head.next = swapPairs(head.next.next); // changing links
        temp.next = head; // put temp -> next to head
        
        return temp; // now after changing links, temp act as our head
    }
}