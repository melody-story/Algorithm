class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int n = nums.length;
        left[0] = 0;
        right[n-1] = 0;
        for(int i=1;i<n;i++){
            left[i] += left[i-1]+nums[i-1];
            right[n-i-1] += right[n-i]+nums[n-i];
        }
        for(int i=0;i<n;i++){
            nums[i] = Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}