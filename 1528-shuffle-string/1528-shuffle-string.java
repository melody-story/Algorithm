class Solution {
    //13:58 ~ 14:08
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        char[] sArray = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = sArray[i];
        }
        String s1="";
        for(char sa: result){
            s1+=sa;
        }
        return s1;
    }
}