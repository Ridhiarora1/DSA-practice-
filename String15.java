import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] have = new int[26]; 

        for(char c: s1.toCharArray()){
            need[c - 'a'] ++; 
        }

        int w = s1.length(); 

        for(int i = 0; i<s2.length(); i++){
            have[s2.charAt(i) - 'a'] ++; 

            if(i >= w){
                have[s2.charAt(i - w) - 'a'] --; 
            }

            if(Arrays.equals(need , have)) return true; 
        }

        return false; 
    } 
} 
