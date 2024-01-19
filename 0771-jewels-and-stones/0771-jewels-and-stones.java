class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] charArray = jewels.toCharArray();
        char[] stoneArray = stones.toCharArray();
        for (char c:charArray){
            for(char s:stoneArray){
                if (c != s) continue;
                count++;
            }
        }
        return count;
    }
}