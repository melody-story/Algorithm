class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xArray = new int[n];
        for (int i = 0; i < n; i++) {
            xArray[i] = points[i][0];
        }
        Arrays.sort(xArray);
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            max=Math.max(max, xArray[i+1]-xArray[i]);
        }
        return max;
    }
}