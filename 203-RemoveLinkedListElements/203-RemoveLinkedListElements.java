// Last updated: 8/18/2025, 2:08:29 PM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while (slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return slow == 1;
    }
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n /= 10;
        }
        return totalSum;
    }
}