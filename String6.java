import java.util.*;

class Solution {

    public String decodeString(String s) {
         Stack<Integer> numStack = new Stack<>();
         Stack<String> strStack = new Stack<>();
         String curr = "";
         int num = 0; 

         for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            }

            else if (c == '[') {
                numStack.push(num);
                strStack.push(curr); 
                num = 0;
                curr = ""; 
            }

            else if(c == ']') {
                int times = numStack.pop();
                String before = strStack.pop(); 
            

            StringBuilder sb = new StringBuilder(before); 
            for(int i = 0; i<times; i++){
                sb.append(curr); 
            } 

                curr = sb.toString(); 
        } 
        

            else {
                curr+= c; 
            }
         }

         return curr; 
        }
    } 
