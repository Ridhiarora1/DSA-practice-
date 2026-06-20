class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Case 1: target found
            if (nums[mid] == target) {
                return mid;
            }

            // Case 2: Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;   // search left
                } else {
                    low = mid + 1;    // search right
                }
            }
            // Case 3: Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;    // search right
                } else {
                    high = mid - 1;   // search left
                }
            }
        }

        return -1;
    }
}

        
    

