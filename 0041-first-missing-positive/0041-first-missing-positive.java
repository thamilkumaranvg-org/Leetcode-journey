class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int n=1;
       for(int i: nums){
        if(i==n){
            n++;
        }
        else if(i>n){
            return n;
        }
       } 
       return n;
    }
}