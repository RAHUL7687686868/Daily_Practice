// Last updated: 8/13/2025, 2:42:11 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if(c > target){
                return c;
            }
        }
        return letters[0];
    }
}