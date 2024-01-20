class Solution {
    public int maximumWealth(int[][] accounts) {
        int sumMax=0;
        for (int j =0;j<accounts.length;j++){
            int sum = 0;
            for (int i = 0; i < accounts[j].length; i++) {
                sum +=accounts[j][i];
            }
            sumMax = Math.max(sumMax, sum);
        }
        return sumMax;
    }
}