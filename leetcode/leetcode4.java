public class leetcode4 {
    
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (nums[mid] == target) {
                    return mid;
                }
                
                // Check which half of the array is sorted
                if (nums[left] <= nums[mid]) {
                    // Left half is sorted
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    // Right half is sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            
            return -1;
        }
    
        public static void main(String[] args) {
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            int result = search(nums, target);
            
            if (result != -1) {
                System.out.println("Target " + target + " found at index " + result);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }
    }
    

