class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>   map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int Diff=target-nums[i];
            if(map.containsKey(Diff)){
                return  new int[] {map.get(Diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}