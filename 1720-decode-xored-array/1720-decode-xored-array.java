class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ints = new int[encoded.length + 1];
        ints[0] = first;
        int x = first;
        for (int i = 0; i < encoded.length; i++) {
            ints[i+1] = ints[i] ^ encoded[i];
        }
        return ints;
    }
}