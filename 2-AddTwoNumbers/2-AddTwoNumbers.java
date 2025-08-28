// Last updated: 8/28/2025, 10:30:30 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        Set<Integer> result = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]); 
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] intersection = new int[result.size()];
        int k = 0;
        for (int num : result) {
            intersection[k++] = num;
        }

        return intersection;
    }
}