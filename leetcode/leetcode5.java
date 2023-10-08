public class leetcode5 {


        public int search(ArrayReader reader, int target) {
            int left = 0;
            int right = 1; 
    
        
            while (reader.get(right) < target) {
                left = right;
                right *= 2;
            }
    
          
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = reader.get(mid);
    
                if (midValue == target) {
                    return mid;
                } else if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return -1;
        }
    }
    
