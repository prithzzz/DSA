// Approach: (slow-fast approach)
// Have 2 pointers(single & twice), while single moves next by one place, twice moves to next by two place.
// So twice pointer reaches the end of the list when single pointer reaches the middle within the same while loop.

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
    public ListNode middleNode(ListNode head) {
        ListNode single = head;
        ListNode twice = head;

        while(twice != null && twice.next != null){
            single = single.next;
            twice = twice.next.next;
        }

        return single;
    }
}