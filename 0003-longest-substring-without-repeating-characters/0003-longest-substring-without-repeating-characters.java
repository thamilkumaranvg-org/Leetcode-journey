class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen  = 0;
        int n = s.length();
        for(int i =0; i< n ; i++){
             int len =1;
             Set<Character> set = new HashSet<>();
             set.add(s.charAt(i));
            for(int j = i+1; j< n;j++){
                char c1 = s.charAt(j);
                if(!set.contains(c1)){
                    set.add(c1);
                    len++;
                }else{
                    break;
                }
            }
           maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}