// Last updated: 8/28/2025, 2:37:21 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length; i++){
            result = result ^ nums[i];//doing the XOR operation to find the unique one
        }
            return result;
    }
}