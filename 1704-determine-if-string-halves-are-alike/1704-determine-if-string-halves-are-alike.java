import java.util.Arrays;
class Solution {
    public boolean halvesAreAlike(String s) {
        char[] sample = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        // 모음수가 같아야 같은 단어다.
        int spilitIndex = s.length()/2;
        char[] a  = Arrays.copyOfRange(s.toCharArray(),0,spilitIndex);
        char[] b  = Arrays.copyOfRange(s.toCharArray(),spilitIndex,s.length());
        Arrays.sort(sample);
        Arrays.sort(a);
        Arrays.sort(b);
        int countA =0;
        int countB =0;
        for (char ss : sample){
            for (char aa : a) {
                if(aa==ss) countA++;
            }
            for (char bb : b) {
                if(bb==ss) countB++;
            }
        }
        return (countB == countA) ?  true : false;
    }
}