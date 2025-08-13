// Last updated: 8/13/2025, 2:41:53 PM
class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}