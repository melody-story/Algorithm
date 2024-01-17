class Solution {
    public int[] buildArray(int[] nums) {
        int ln = nums.length;
        int[] ints = new int[ln];
        for (int i = 0; i < ln; i++) {
            ints[i]=nums[nums[i]];
        }
        return ints;
    }
}