public class MaximumSubarray_0053 {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] > sum) & (sum < 0)) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
