import java.util.Arrays;

public class ThreeSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int closestDifference = Integer.MAX_VALUE;

        for (int first = 0; first < nums.length - 2; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int middle = first + 1;
            int last = nums.length - 1;

            while (middle < last) {
                int sum = nums[first] + nums[middle] + nums[last];
                int difference = Math.abs(target - sum);

                if (closestDifference > difference) {
                    closestDifference = difference;
                    closestSum = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    last--;
                } else {
                    middle++;
                }
            }
        }
        return closestSum;
    }
}
