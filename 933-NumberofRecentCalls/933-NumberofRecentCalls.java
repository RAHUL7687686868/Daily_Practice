// Last updated: 8/17/2025, 11:29:18 PM
class Solution {
    public int arrayNesting(int[] nums) {
        int maxLen = 0;
        boolean [] visit = new boolean[nums.length];
        for(int i  = 0; i < nums.length; i++){
            if(!visit[i]){
                int count = 0;
                int curr = i;
                while(!visit[curr]){
                    visit[curr] = true;
                    curr = nums[curr];
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}