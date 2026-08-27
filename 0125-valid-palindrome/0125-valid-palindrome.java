class Solution {
    String intoAlphanum(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
    public boolean isPalindrome(String s) {
        String str = intoAlphanum(s);
        int initial = 0;
        int last = str.length()-1;
       while(initial<last){
        if(str.charAt(initial)!=str.charAt(last)) return false;
        initial++;
        last--;
       }
        return true;
    }
}