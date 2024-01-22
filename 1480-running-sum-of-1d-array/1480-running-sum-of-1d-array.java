class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int o = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = o + nums[i];
            o = result[i];
        }
        return result;
    }
}