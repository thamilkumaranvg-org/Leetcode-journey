class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] seen = new int[128];
        int l = 0;
        for(int r =0; r < s.length(); r++){
            char ch = s.charAt(r);
            l = Math.max(l, seen[ch]);
            maxLen = Math.max(maxLen, r - l + 1);
            seen[ch] = r + 1;
        }
        return maxLen;
    }
}