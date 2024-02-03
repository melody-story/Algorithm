class Solution {
    public List<String> cellsInRange(String s) {
        char[] charArray = s.toCharArray();
        int startAlph = charArray[0];
        int startDigit = Character.getNumericValue(charArray[1]);
        int endAlph = charArray[3];
        int endDigit = Character.getNumericValue(charArray[4]);
        int i = 'Z';//65 ~ 90
        List<String> result = new ArrayList<>();
        for (int k = startAlph; k <= endAlph; k++) {
            for (int j = startDigit; j <= endDigit; j++) {
                String item = (char)k + String.valueOf(j);
                result.add(item);
            }
        }
        return result;
    }
}