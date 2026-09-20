class Solution(object):
    def digitCount(self, num):
        count = 0
        while num:
            num //= 10
            count += 1
        return count
    def findNumbers(self, nums):
        count = 0
        for i in nums:
            digits = self.digitCount(i)
            if (digits & 1) == 0:
                count += 1
        return count
        
        