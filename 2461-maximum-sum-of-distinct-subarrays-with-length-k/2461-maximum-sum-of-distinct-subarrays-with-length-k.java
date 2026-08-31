import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            max = sum;
        }

        for (int i = k; i < nums.length; i++) {

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            int old = nums[i - k];
            sum -= old;

            map.put(old, map.get(old) - 1);

            if (map.get(old) == 0) {
                map.remove(old);
            }

            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}