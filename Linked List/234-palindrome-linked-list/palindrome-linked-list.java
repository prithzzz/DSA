// Approach:
// First use slow/fast pointers to find the middle of the list. Then, reverse the 2nd half of the list. 
// Finally use left/right pointers to check first and last node values while moving inwards and return false if nodes dont match.

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
        ListNode slow = head;   ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while(slow != null){
            ListNode next_pt = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next_pt;
        }

        ListNode left = head;   ListNode right = prev;
        while(right != null){
            if(left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}