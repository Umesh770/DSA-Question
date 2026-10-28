class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        
        List<String> path=new ArrayList<>();
        backtrack(s,0,path);
        return ans;
    }
    public void backtrack(String s,int start,List<String> path){
        if(start==s.length()){
            ans.add(new ArrayList(path));
        }
       for (int i = start; i < s.length(); i++) {
    String sub = s.substring(start, i + 1);

    if (isPalindrome(sub)) {
        path.add(sub);

        backtrack(s, i + 1, path);

        path.remove(path.size() - 1);
    }
}

    }
    public boolean isPalindrome(String s){
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