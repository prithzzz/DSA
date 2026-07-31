// Approach: (slow/fast)
// Slow pointer moves next by one place and fast pointer moves next by two places
// As slow pointer moves through every node in the list, the fast pointer either hits null(no cycle) or fast pointer enters the cycle until it equates to slow pointer.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head; ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}