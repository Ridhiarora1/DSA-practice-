 class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null; 
        } 

        ListNode slow = head , fast = head; // use of floyd algorthim 
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next; 

            if(slow == fast){ // cycle is detected 
                slow = head;

                while(slow!= fast){
                    slow = slow.next;
                    fast = fast.next; 
                }

                return slow; 

            }
        }

        return null; 
        
    }
}
