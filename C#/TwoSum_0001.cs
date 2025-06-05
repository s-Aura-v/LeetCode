using System;
using System.Collections.Generic;

namespace TwoSum
{
    class TwoSum_0001
    {
        public static int[] TwoSum(int[] nums, int target)
        {
            Dictionary<int, int> map = new Dictionary<int, int>();

            for (int i = 0; i < nums.Length; i++)
            {
                int complement = target - nums[i];
                if (map.ContainsKey(complement))
                {
                    return new int[] { map[complement], i };
                }
                map[nums[i]] = i;
            }

            return null; // If no solution is found
        }

        static void Main(string[] args)
        {
            // Test Case 1
            int[] nums1 = { 2, 7, 11, 15 };
            int target1 = 9;
            Console.WriteLine("Test Case 1: [" + string.Join(", ", TwoSum(nums1, target1)) + "]");

            // Test Case 2
            int[] nums2 = { 3, 2, 4 };
            int target2 = 6;
            Console.WriteLine("Test Case 2: [" + string.Join(", ", TwoSum(nums2, target2)) + "]");

            // Test Case 3
            int[] nums3 = { 3, 3 };
            int target3 = 6;
            Console.WriteLine("Test Case 3: [" + string.Join(", ", TwoSum(nums3, target3)) + "]");
        }
    }
}