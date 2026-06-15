class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head; 
        ListNode prev = null; 

        while(curr!= null) {
            ListNode ne = curr.next; 
            curr.next = prev; 

            prev = curr; 
            curr = ne; 
        }

        return prev; 
        
    }
} 
