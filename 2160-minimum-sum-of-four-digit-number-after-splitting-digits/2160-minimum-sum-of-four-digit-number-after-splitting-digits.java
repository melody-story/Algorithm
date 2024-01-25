class Solution {
    public int minimumSum(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        List<Integer> chars = new ArrayList<>(charArray.length);
        for (char cha : charArray){
            chars.add(Character.getNumericValue(cha));
        }
        Collections.sort(chars);
        return (chars.get(0) * 10 + chars.get(2)) + (chars.get(1) * 10 + chars.get(3));
    }
}