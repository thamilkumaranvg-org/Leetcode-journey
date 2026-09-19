class Solution(object):
    def numIdenticalPairs(self, nums):
        pairs = 0
        count = [0]*101
        for i in nums: 
            pairs += count[i]
            count[i] += 1
        return pairs
        