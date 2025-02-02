import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    // Optimal Way:
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> list = new ArrayList<>();

        for (int first = 0; first < nums.length - 2; first++) {
            // Skip duplicates for the first element
            // When we move forward in our calculation, we want to make sure that we don't look at the same element twice because it will lead to duplication, so make sure [first] != [first - 1];
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int middle = first + 1;
            int last = nums.length - 1;

            while (middle < last) {
                int sum = nums[first] + nums[middle] + nums[last];

                if (sum < 0) {
                    middle++;
                } else if (sum > 0) {
                    last--;
                } else {
                    list.add(Arrays.asList(nums[first], nums[middle], nums[last]));

                    while (middle < last && nums[middle] == nums[middle + 1]) {
                        middle++;
                    }
                    while (middle < last && nums[last] == nums[last - 1]) {
                        last--;
                    }

                    middle++;
                    last--;
                }
            }
        }

        return list;
    }

    // Original Attempt: Did not work out properly
    public static List<List<Integer>> failedThreeSum(int[] nums) {
        int first = 0;
        int middle = nums.length - 2;
        int last = nums.length - 1;
        Arrays.sort(nums);
        ArrayList<List<Integer>> list = new ArrayList<>();
        while (first < middle) {
            int sum = nums[first] + nums[middle] + nums[last];
            if (sum < 0) {
                first++;
                middle = nums.length - 2;
                last = nums.length - 1;
            } else if (sum > 0) {
                middle--;
                last--;
            } else {
                first++;
                list.add(Arrays.asList(nums[first], nums[middle], nums[last]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new List[]{threeSum(new int[]{-1, 0, 1, 2, -1, -4})}));
//        System.out.println(Arrays.toString(new List[]{threeSum(new int[]{0,0,0})}));
    }
}
