class Solution {
    boolean containsSub(String str1,String str2){
        if(str2.length()>str1.length())return false;
        
        for(int i=0;i<=str1.length()-str2.length();i++){
           int count=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i+j)!=str2.charAt(j))break;
                count++; 
            }
            if(count==str2.length())return true;
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> lst=new ArrayList<>();
        for(String i:words){
            for(String j:words){
                if(containsSub(i,j)&&i!=j){
                    if(!lst.contains(j))lst.add(j);
                }
            }
        }
        return lst;
    }
}