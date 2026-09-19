class Solution {
    public int majorityElement(int[] nums) {
        int Max=0;
        Map<Integer,Integer> map=new HashMap<>();
        int Value=0;
    
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>Max){
                Max=map.get(key);
                Value=key;

            }
        }
        return Value;
    }
}