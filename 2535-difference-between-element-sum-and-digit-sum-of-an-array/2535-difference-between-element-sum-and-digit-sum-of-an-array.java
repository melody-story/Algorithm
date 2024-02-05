class Solution {
    static int digitSum(int n){
        int s = 0;
        while(n>9){
            s += n%10;
            n /= 10;
        }
        s += n;
        return s;
    }

    public int differenceOfSum(int[] nums) {
        int a=0, b=0;
        for(int i: nums){
            a += i;
            b += digitSum(i);
        }
        return Math.abs(a-b);
    }
}