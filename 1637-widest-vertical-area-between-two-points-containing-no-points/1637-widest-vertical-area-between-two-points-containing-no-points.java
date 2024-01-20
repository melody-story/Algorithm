class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x = Arrays.stream(points).mapToInt(point->point[0]).sorted().toArray();
        int maxWidth=0;
        for(int i=0;i<x.length-1;i++){
            maxWidth = Math.max(maxWidth,x[i+1]-x[i]);
        }
        return maxWidth;
    }
}