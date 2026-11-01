class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                 if(palindrome(sub)){
                   if (sub.length() > ans.length()) {
                        ans = sub;
                    }
            }
           }
           
        }
        return ans;
    }
    public boolean palindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}