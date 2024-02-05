class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;
        Map<Integer, Integer> digitCnt = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            digitCnt.put(i, 0);
        }

        int key = 0;
        int t = 0;
        for (int n : nums) {
            eSum += n;
            int length = String.valueOf(n).length();
            int d = n;
            for (int i = 0; i < length; i++) {
                key = d % 10;
                t = d / 10;
                d = t;
                Integer value = digitCnt.get(key);
                if (value == null)
                    continue;
                digitCnt.put(key, ++value);
            }
        }
        Set<Integer> keySet = digitCnt.keySet();
        for (int k : keySet) {
            dSum += k * digitCnt.get(k);
        }
        return eSum - dSum < 0 ? (-1) * (eSum - dSum) : eSum - dSum;
    }
}