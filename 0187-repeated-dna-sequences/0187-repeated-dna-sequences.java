class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> repeated=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String window=s.substring(i,i+10);
           if(set.contains(window)){
            if(!repeated.contains(window)){
                ans.add(window);
                repeated.add(window);
            }
           }
           else{
            set.add(window);
           }
        }
        return ans;
    }
}