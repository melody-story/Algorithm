    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> target = new ArrayList<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                target.add(index[i],nums[i]);
            }
            
            // 추가 메모리를 차지하는 객체를 생성하게 됨.
//            Integer[] array = target.toArray(new Integer[0]);
//            return Arrays.stream(array).mapToInt(i->i).toArray();

            // 기존 공간을 사용함으로써 불필요한 공간 생기지 않도록 함.
            for(int i = 0; i < nums.length; i++){
                nums[i] = target.get(i);
            }
            return nums;
        }
    }