class Solution {
    public int thirdMax(int[] nums) {
       long max3=Long.MIN_VALUE,max2=Long.MIN_VALUE,max=Long.MIN_VALUE;
       for(long i:nums){
        if(i>max){
            max3=max2;
            max2=max;
            max=i;
        }else if(i>max2 && i!=max){
            max3=max2;
            max2=i;
        }else if(i>max3&& i!=max2 && i!=max){
            max3=i;
        }
       }
       if(max3==Long.MIN_VALUE)return (int) max;
       if(max2==Long.MIN_VALUE)return (int) max;
       return (int) max3;
    }
}