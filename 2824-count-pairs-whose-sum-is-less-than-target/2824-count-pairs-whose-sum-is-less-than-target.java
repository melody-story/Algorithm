    class Solution {
        public int countPairs(List<Integer> nums, int target) {
            int cnt =0;
            int array[] = new int[nums.size()];
            for(int i=0;i<nums.size();i++){
                array[i]=nums.get(i);
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] + array[j] < target) cnt++;
                }
            }
            return cnt;
        }
    }