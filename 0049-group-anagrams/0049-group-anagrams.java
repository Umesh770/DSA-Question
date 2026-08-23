class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String ch : strs) {

            int[] freq = new int[26];
            for (char c : ch.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);

        
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(ch);
        }

        return new ArrayList<>(map.values());
    }
}