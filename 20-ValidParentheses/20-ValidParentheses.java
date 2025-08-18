// Last updated: 8/18/2025, 1:43:45 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        return s.length() - lastSpaceIndex - 1;
    }
}