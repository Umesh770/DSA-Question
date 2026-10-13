class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int base=0;
        int area=0;
        int h=0;
        int maxwater=0;
        while(l<r){
            base=r-l;
            h=Math.min(height[l],height[r]);
            area=base*h;
            maxwater=Math.max(maxwater,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater;
    }
}