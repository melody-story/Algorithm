class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i],nums[i]);
        }
        Integer[] array = target.toArray(new Integer[0]);
        return Arrays.stream(array).mapToInt(i->i).toArray();
    }
}