
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast!= null && fast.next!=null){
            slow = slow.next; 
            fast = fast.next.next; 
        }

        ListNode mid = slow; 

        ListNode curr = mid; 
        ListNode prev = null; 

        while(curr!= null){
            ListNode ne = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = ne; 
        }

         curr = head; 
        while(prev!= null){
            if(curr.val != prev.val){
                return false; 
            } else{
                curr = curr.next; 
                prev = prev.next; 
            }
        } 

        return true; 
    }
}