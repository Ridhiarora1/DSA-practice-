class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()){
            stack.append(c);

        if(stack.length() >= part.length()){
            if(stack.substring(stack.length() - part.length()) .equals(part)){
                stack.delete(stack.length() - part.length(), stack.length());   
            }
        }  
    }

    return stack.toString();
}
} 
