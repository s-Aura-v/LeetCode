import java.util.HashSet;

public class LongestConsecutiveSequence_128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // Store all numbers in a set for O(1) lookup
        }

        int maxLength = 0;

        for (int num : numSet) {
            // Only start counting if it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {

    }
}


// BROKEN SOLUTION - INITIAL ATTEMOT
// FAILURE: TOOK TOO MANY CALCULATIONS AND COULD NOT COMPUTE LARGE PROGRAMS BECAUSE IT CHECKED EVERY NUMBER
/*
public static int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        HashSet<Integer> numsMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.add(nums[i]);
        }
        int maxSolution = 0;
        for (int number : nums) {
            int solution = testForNum(number, numsMap);
            if (solution > maxSolution) {
                maxSolution = solution;
            }
        }
        return maxSolution;
    }

    static int testForNum(int num, HashSet<Integer> map) {
        if (!map.contains(num + 1)) return 1;
        int i = 1;

        while (true) {
            if (map.contains(num + i)) {
                i++;
            } else {
                break;
            }
        }

        return i;
    }
 */