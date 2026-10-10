class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int j = num;
        while(i <= j){
            long mid = (i + j)>>>1;
            if(mid * mid == num)return true;
            else if(mid * mid < num)i = (int)mid + 1;
            else j = (int)mid - 1;
        }
        return false;
    }
}