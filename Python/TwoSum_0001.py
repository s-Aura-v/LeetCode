# enumerate() -> returns key-value pair from a list (i, num)

def two_sum(nums, target):
    seen = {}
    for i, num in enumerate(nums):
        if (target - num) in seen:
            return [seen[target - num], i]
        seen[num] = i
    return None;

# Test Cases
print("Test Case 1:", two_sum([2, 7, 11, 15], 9))   # Expected: [0, 1]
print("Test Case 2:", two_sum([3, 2, 4], 6))        # Expected: [1, 2]
print("Test Case 3:", two_sum([3, 3], 6))           # Expected: [0, 1]
