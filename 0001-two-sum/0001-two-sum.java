class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int Current_Value=nums[i];
            int Diff=target-Current_Value;
            if(map.containsKey(Diff)){
                return new int[] {map.get(Diff),i};
            }
            map.put(Current_Value,i);
        }
        return null;
    }
}