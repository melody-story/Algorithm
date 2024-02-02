class Solution {
    //13:06 - 13:48
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int listSize = items.size();
        int cnt = 0;
        int index =  ruleKey.equals("type")? 0 : ruleKey.equals("color")? 1 : 2;
        for (int i = 0; i < listSize; i++) {
            if (ruleValue.equals(items.get(i).get(index))) cnt++;
        }
        return cnt;
    }
}