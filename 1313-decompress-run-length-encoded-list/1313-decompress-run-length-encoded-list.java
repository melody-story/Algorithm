class Solution {
    //17:50 ~ 18:22
    public int[] decompressRLElist(int[] nums) {

        int size = 0;
        for (int i = 0; i < nums.length/2; i++) {
            size += nums[2*i];
        }

        int[] ints = new int[size];
        int j = 0;
        while (j<size){
            for (int i = 0; i < nums.length/2; i++) {
                int freq = nums[2*i];
                int item = nums[2*i+1];
                for (int k = 0; k < freq; k++) {
                    ints[j] = item;
                    j++;
                }
            }
        }
        return ints;
    }
}