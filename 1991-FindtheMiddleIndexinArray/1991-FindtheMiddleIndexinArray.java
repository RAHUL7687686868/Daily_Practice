// Last updated: 8/29/2025, 11:59:15 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = findFirst(nums, target);
        int lst = findLast(nums, target);
        return new int[]{st , lst};
    }

    private int findFirst(int[] n, int t) {
        int st = 0, ed = n.length - 1;
        int ans = -1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (n[mid] >= t) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
            if (n[mid] == t) ans = mid;
        }
        return ans;
    }

    private int findLast(int[] n, int t) {
        int st = 0, ed = n.length - 1;
        int ans = -1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (n[mid] <= t) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
            if (n[mid] == t) ans = mid;
        }
        return ans;
    }
}
