class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int sum=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            char next =  (i+1 < s.length()) ? s.charAt(i+1) : ch;
            int current=map.get(ch);
            int nnum =  (ch != next) ? map.get(next) : 0;
            if(current  < nnum){
                sum -= current;
            }
            else{
                sum += current;
            }
            
    }
    return sum;
    }
}