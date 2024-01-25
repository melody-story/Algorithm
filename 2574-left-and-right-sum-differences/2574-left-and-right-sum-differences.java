class Solution {
    public int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        int [] leftSum = new int[length];
        leftSum[0] = 0;
        int [] rightSum = new int[length];
        rightSum[length-1] = 0;
        for (int i = 1; i < length; i++) {
            leftSum[i] += leftSum[i-1] + nums[i-1];
            rightSum[(length-1)-i] += rightSum[length-i] + nums[length-i];
        }
        for (int i = 0; i < length; i++) {
//                ans[i] = leftSum[i]>rightSum[i]?leftSum[i]-rightSum[i]:rightSum[i]-leftSum[i];
            nums[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return nums;
    }
}