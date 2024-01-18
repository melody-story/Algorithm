class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int result1 = (num - (t* 1)) + (t * 1);
        int result2 = (num + (t* 1)) + (t * 1);
        return result1 > result2 ? result1 : result2;
    }
}