class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
    HashSet<String> repeat=new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String window=s.substring(i,i+10);
            if(set.contains(window)){
                if(!repeat.contains(window)){
                    ans.add(window);
                    repeat.add(window);
                }
            }
            else{
                set.add(window);
            }
        }
        return ans;
    }
}