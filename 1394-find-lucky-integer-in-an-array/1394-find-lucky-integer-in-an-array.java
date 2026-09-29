class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            
            int num=entry.getKey();
            int freq=entry.getValue();

         
            if(num==freq){
                max=Math.max(max,num);
               
               
            }
           
            
        }
       return max==0? -1:max;
    }
}