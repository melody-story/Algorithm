class Solution {
    public int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>(100);
        for (int n :nums) {
            list.add(n);
        }
        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < nums.length; i+=2) {
            nums[i] = list.get(i+1);
            nums[i+1] = list.get(i);
        }
        return nums;
    }
}