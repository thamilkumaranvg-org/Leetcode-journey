class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;
        int i;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++)rightSum += nums[j];
            for(int k=i-1;k>=0;k--)leftSum +=nums[k];

            if(leftSum == rightSum){
                return i;
            }else {
                leftSum =0;
                rightSum =0;
            }
        }
        
        
        return -1;
    }
}