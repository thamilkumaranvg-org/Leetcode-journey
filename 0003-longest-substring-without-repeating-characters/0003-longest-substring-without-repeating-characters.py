class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = [0] * 128
        l, maxLen = 0, 0
        for r in range(len(s)):
            ch = s[r]
            asc = ord(ch)
            l = max(l, seen[asc])
            maxLen = max(maxLen, r - l + 1)
            seen[asc] = r + 1
        return maxLen