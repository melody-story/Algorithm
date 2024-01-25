class Solution {
    public int minimumSum(int num) {
        char[] charArray = new String(String.valueOf(num)).toCharArray();
        List<Character> chars = new ArrayList<>(charArray.length);
        for (char cha : charArray){
            chars.add(cha);
        }
        chars.sort(Comparator.naturalOrder());
        StringBuilder append = new StringBuilder(String.valueOf(chars.get(0))).append(chars.get(2));
        Integer integer = new Integer(String.valueOf(append));
        StringBuilder append1 = new StringBuilder(String.valueOf(chars.get(1))).append(chars.get(3));
        Integer integer1 = new Integer(String.valueOf(append1));
        return integer + integer1;
    }
}