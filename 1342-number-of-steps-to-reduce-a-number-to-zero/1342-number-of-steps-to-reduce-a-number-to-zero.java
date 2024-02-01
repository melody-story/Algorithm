public class Solution {
    int cnt = 0;
    public int numberOfSteps(int num) {
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            cnt++;
        }
        return cnt;
    }
}