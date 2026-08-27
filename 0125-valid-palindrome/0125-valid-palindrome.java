class Solution {
    public boolean isPalindrome(String s) {
        if(s==null && s.length()== 0) return false;
        int initial=0;
        int last= s.length() - 1;
        while(initial<=last){
            char ch = s.charAt(initial);
            char ch1=s.charAt(last);
            if(!((ch>='A' && ch<='Z') ||(ch>='0'&&ch<='9')||(ch>='a'&&ch<='z'))){
                initial++;
                continue;
            }
            if(!((ch1>='A' && ch1<='Z') ||(ch1>='0'&&ch1<='9')||(ch1>='a'&&ch1<='z'))){
                last--;
                continue;
            }
            if(ch>='A' && ch<='Z')ch+=32;
            if(ch1>='A' && ch1<='Z')ch1+=32;
            if(ch!=ch1) return false;
            initial++;
            last--;
        }
        return true;
    }
}