 class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        // Step 1: Find middle node
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Split list into two halves
        ListNode secondHalf = slow.next;
        slow.next = null;
        
        // Step 3: Reverse the second half
        ListNode reversed = reverse(secondHalf);
        
        // Step 4: Merge the two halves
        merge(head, reversed);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
       
    private void merge(ListNode first, ListNode second) {
        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            
            first.next = second;
            second.next = firstNext;
            
            first = firstNext;
            second = secondNext;
        }
    }
} 
