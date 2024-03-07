class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        int l = -1;
        loopOut:
        for (int i = 0; i < word.length(); i++) {
            String c = word.substring(0, i + 1);
            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                if (!str.startsWith(c)) {
                    break loopOut;
                }
                if (j == strs.length - 1) {
                    l = i;
                }
            }
        }
        return strs.length == 1 ? word : l == -1 ? "" : word.substring(0, l + 1);
    }
}