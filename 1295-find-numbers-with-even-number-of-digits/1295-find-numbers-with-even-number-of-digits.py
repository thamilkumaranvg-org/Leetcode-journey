class Solution(object):
    def findNumbers(self, nums):
        count = 0
        for i in nums:
            digits = len(str(i))
            if digits % 2 == 0:
                count += 1
        return count
        
        