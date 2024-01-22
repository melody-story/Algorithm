class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int size = sentences[i].split(" ").length;
            max = max > size ?  max : size;
        }
        return max;
    }
}