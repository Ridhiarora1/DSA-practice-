class Solution {
    public String minWindow(String s, String t){
        int[] need = new int[128];
        int[] have = new int[128]; 

        for(char c : t.toCharArray()) {
            need[c]++;
        } 

        int left = 0;
        int count = 0;
        int total = t.length();
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int right = 0; right<s.length(); right++) {
            have[s.charAt(right)]++;

            if(have[s.charAt(right)] <= need[s.charAt(right)]) {
                count++; 
            }
            
            while(count == total) {
                if(right - left + 1 < min) {
                    min = right - left + 1; 
                    ans = left; 
                }

                have[s.charAt(left)]--; 
                if(have[s.charAt(left)] < need[s.charAt(left)]) {
                    count--; 
                }

                left++; 
            }
            }

            return min == Integer.MAX_VALUE ? "" : s.substring(ans , ans + min); 

            }
        }
        



















    
    
    
    
    
    






