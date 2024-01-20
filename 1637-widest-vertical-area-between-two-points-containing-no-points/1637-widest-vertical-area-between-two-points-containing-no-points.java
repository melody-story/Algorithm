class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xArray = new int[n];
        for (int i = 0; i < n; i++) {
            xArray[i] = points[i][0];
        }
        int[] array = Arrays.stream(xArray).sorted().toArray();
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            int result = array[i + 1] - array[i];
            if (result > max) max = result;
        }
        return max;
    }
}