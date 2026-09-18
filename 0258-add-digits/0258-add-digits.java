class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0;
        int value = num % 9;
        return (value == 0)? 9 : value;
    }
}