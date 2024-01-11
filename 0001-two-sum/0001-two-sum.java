import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0; i < nums.length-1; i++){
                int item =  nums[i];
                for(int j=i+1; j < nums.length; j++){
                    int item2 = nums[j];
                    int sum = item + item2;
                    if(sum == target){
                        output[0] = i;
                        output[1] = j;                        
                        break;
                    }
                }
        }
        return output;
    }
}