class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt =0;
        Integer[] array = nums.toArray(new Integer[0]);
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (array[i] + array[j] < target) cnt++;
            }
        }
        return cnt;
    }
}