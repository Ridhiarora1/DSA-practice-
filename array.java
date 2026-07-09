import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        int n = nums.length;

        Arrays.sort(nums);
        for(int i = n-2; i>=0; i--){
            if(i>0 && nums[i] == nums[i-1]){
                break;
            }

            int left = i + 1;
            int right = n - 1; 

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i] , nums[left] , nums[right])); 
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } 

                else if (sum < 0){
                    left++;
                    
                } else {
                    right--; 
                }
                }
            } 

            return ans; 

            }

     public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(s.threeSum(nums));

     }
    }
    






