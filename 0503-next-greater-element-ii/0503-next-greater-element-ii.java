class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] dup=new int[nums.length];
        int n = nums.length;
        
        for(int i=0;i<nums.length;i++){
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    dup[i]=nums[j];
                    flag=false;
                    break;
                }
            }
            if(flag){
             for(int k=0;k<i;k++){
                if(nums[k]>nums[i]){
                    dup[i]=nums[k];
                     flag=false;
                    break;
                }
             }
             }
            if(flag) dup[i]=-1;
        }
        return dup;
    }
}