class Solution {
    public int findMin(int[] nums) {
        int left = 0 , right = nums.length - 1; // finding left and right
        while(left<right){ // condition 
            int mid = left + (right-left)/2; // finding mid 
            if(nums[mid]> nums[right]){ // comparing condition 
                left = mid + 1; // Minimum is in right
            } else{
                right = mid; // Minimmum is in left (including mid)
            }
        }
        return nums[left]; 
        
    }
}



