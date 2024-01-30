class Solution {
    // 18:26 ~ 18:39
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^=(start + 2 * i);
        }
        return result;
    }
}