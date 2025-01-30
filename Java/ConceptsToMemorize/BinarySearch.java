package ConceptsToMemorize;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // if there are elements to examine between left and right, then it will do so.
        // left can never be less than right unless you reach the final index and reach negative midpoint as you subtract -1
        while (left <= right) {
            int midpoint = (left + (right - left) / 2);
            // case 1: you found the target
            if (nums[midpoint] == target) {
                return midpoint;
                // case 2: target is greater than
                // If you do not add 1, you will never reach the final index
            } else if (target > nums[midpoint]) {
                left = midpoint + 1;
                // case 3; target is less than
                // If you do not subtract 1, you will never reach the first index
            } else if (target < nums[midpoint]) {
                right = midpoint - 1;
            }
        }
        // target not found
        return -1;
    }
}


