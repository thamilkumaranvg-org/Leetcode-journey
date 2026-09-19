class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[nums1.length];
        int len = 0;
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                res[len] = i;
                len++;
                set.remove(i);
            }
        }
        return Arrays.copyOf(res, len);
    }
}