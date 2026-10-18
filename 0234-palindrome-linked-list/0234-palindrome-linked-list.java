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

    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            }
            return false;
        }
       ListNode mid = findMid(head); 

       ListNode curr = mid;
       ListNode prev = null;
       ListNode next = null;

       while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

       ListNode left = head;
       ListNode right = prev;

       while(right != null){
        if(left.val != right.val){
            return false;
        }

        right = right.next;
        left = left.next;
       }

       return true;
    }
}