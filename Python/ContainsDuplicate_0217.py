def containsDuplicate(nums):
  # set
  seen = set()
  for num in nums:
      if num in seen:
          return True
      seen.add(num)
  return False

  # hashset
  dic = {}
  for num in nums:
      if num in dic:
          return True
      dic[num] = True
  return False
    
# Test Cases
print(containsDuplicate([1, 2, 3, 4]))       # False, all unique
print(containsDuplicate([1, 2, 3, 1]))       # True, 1 is duplicated
print(containsDuplicate([1]))               # False, single element
print(containsDuplicate([]))                # False, empty list
print(containsDuplicate([1, 1, 1, 1]))       # True, all the same
print(containsDuplicate([1, 2, 3, 4, 5, 6])) # False

      