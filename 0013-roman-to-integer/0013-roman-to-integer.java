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
        for(int i=0;i<s.length()-1;i++){
            
            char ch=s.charAt(i);
            int current=map.get(ch);
            if(current<map.get(s.charAt(i+1))){
                sum-=current;
            }else{
            sum+=map.get(ch);
            }
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}