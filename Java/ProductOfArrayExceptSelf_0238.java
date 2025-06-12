import java.util.Arrays;

public class ProductOfArrayExceptSelf_0238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int prefixValue = 1;
        int postfixValue = 1;
        // prefix
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefixValue;
            prefixValue *= nums[i];
        }

        //postfix
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfixValue;
            postfixValue *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));     // [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{0, 1, 2, 3})));     // [6, 0, 0, 0]
    }
}
