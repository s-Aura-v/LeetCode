import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_0217 {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            if (numSet.contains(num)) {
                return true;
            } else {
                numSet.add(num);
            }
        }
        return false;
    }

    // You could also sort it and check neighbors

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));       // false
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));       // true
        System.out.println(containsDuplicate(new int[]{1}));               // false
        System.out.println(containsDuplicate(new int[]{}));                // false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 1}));       // true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6})); // false

    }
}