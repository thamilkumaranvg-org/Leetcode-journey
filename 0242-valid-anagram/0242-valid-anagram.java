class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character, Integer> mapCount = new HashMap<>();
        for(int i = 0;i < s.length();i++)mapCount.put(s.charAt(i), mapCount.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0;i < t.length();i++){
            char c = t.charAt(i);
            if(!mapCount.containsKey(c) || mapCount.get(c) == 0)return false;
            mapCount.put(c, mapCount.get(c) - 1);
        }
        return true;
    }
}