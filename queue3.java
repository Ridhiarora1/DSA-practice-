import java.util.*; 

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(q == null || q.size() == 0  || k<=0){
            return q; 
        } 
        
        if (k > q.size()) {
            return q; 
        }

            
         Stack<Integer> stack = new Stack<>(); 
            
          for(int i = 0 ; i<k ; i++){
                stack.push(q.remove()); 
            }
            
          while(!stack.isEmpty()){
                q.add(stack.pop()); 
            }
            
           int size = q.size(); 
           for(int i = 0 ; i<size-k; i++ ){
                q.add(q.remove()); 
            }
            
            return q; 
        }
    } 
