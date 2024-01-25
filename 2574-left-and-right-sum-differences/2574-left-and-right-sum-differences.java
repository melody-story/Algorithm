
    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int [] leftSum = new int[nums.length];
            leftSum[0] = 0;
            int [] rightSum = new int[nums.length];
            int length = nums.length;
            rightSum[length-1] = 0;
            for (int i = 1; i < length; i++) {
                leftSum[i] += leftSum[i-1] + nums[i-1];
                rightSum[(length-1)-i] += rightSum[(length-1)-i+1] + nums[(length-1)-i+1];
            }
            for (int i = 0; i < length; i++) {
//                ans[i] = leftSum[i]>rightSum[i]?leftSum[i]-rightSum[i]:rightSum[i]-leftSum[i];
                nums[i] = Math.abs(leftSum[i]-rightSum[i]);
            }
            return nums;
        }
    }