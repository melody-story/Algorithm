class Solution {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        int size = s.length() - k;
        StringBuilder result =new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(s1[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}