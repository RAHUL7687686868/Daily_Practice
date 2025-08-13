// Last updated: 8/13/2025, 2:41:59 PM
class Solution {
    public int maxDepth(String s) {
        int currDep = 0;
        int maxDep = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                currDep++;
                maxDep = Math.max(maxDep, currDep);
            }
            else if(c == ')'){
                currDep--;
            }
        }
        return maxDep;
    }
}