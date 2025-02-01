import java.util.Arrays;

public class TwoSumII_167 {
    // Brute forcing - very simple and slow
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    // Optimal Solution - two pointers summed up
    public static int[] optimalTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(optimalTwoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
