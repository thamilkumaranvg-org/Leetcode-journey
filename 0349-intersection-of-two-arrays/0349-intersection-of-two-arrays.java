class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> lst = new ArrayList<>();
        for(int i : nums1){
            
            for(int j : nums2){
                if(i == j && !lst.contains(i)){
                    lst.add(i);
                    break;
                }
            }
            
        }
        int[] result = new int[lst.size()];
        for(int i=0; i<lst.size();i++){
            result[i] = lst.get(i);
        }
        return result;
    }
}