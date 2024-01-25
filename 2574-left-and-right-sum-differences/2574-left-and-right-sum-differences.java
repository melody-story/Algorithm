    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int [] leftSum = new int[nums.length];
            int [] rightSum = new int[nums.length];
            int length = nums.length;
            leftSum[0] = 0;
            rightSum[length-1] = 0;
            for (int i = 1; i < length; i++) {
                leftSum[i] += leftSum[i-1] + nums[i-1];
                rightSum[(length-1)-i] += rightSum[length-i] + nums[length-i];
            }
            for (int i = 0; i < length; i++) {
                nums[i] = Math.abs(leftSum[i]-rightSum[i]);
            }
            return nums;
        }
    }