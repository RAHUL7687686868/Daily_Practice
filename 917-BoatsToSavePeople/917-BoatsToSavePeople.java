// Last updated: 8/13/2025, 2:42:04 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int boats = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}