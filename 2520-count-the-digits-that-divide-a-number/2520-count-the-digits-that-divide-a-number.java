class Solution {
    public int countDigits(int num) {
    String stringDigit = String.valueOf(num);
    int cnt = 0;
    for (Integer i = 0; i < stringDigit.length(); i++) {
        if (num % Character.getNumericValue(stringDigit.charAt(i)) == 0) cnt ++;
    }
    return cnt;
    }
}