class Solution {
    //18:45 ~ 18:49
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = ""; 
        String w2 = ""; 
        for (String w:word1) w1 = w1.concat(w);
        for (String w:word2) w2 = w2.concat(w);
        return w1.equals(w2) ? true : false;
    }
}