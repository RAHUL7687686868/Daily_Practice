// Last updated: 8/17/2025, 11:34:34 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;    
    }
}