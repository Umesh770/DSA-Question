class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<fruits.length;r++){

            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                int old=fruits[l];
                map.put(old,map.get(old)-1);

                if(map.get(old)==0){
                    map.remove(old);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}