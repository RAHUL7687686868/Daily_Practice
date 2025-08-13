// Last updated: 8/13/2025, 2:42:06 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int p : piles){
            high = Math.max(high,p);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            if(canEat(piles, h , mid)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean canEat(int[] piles, int h, int k){
        long hr = 0;
        for(int p : piles){
            hr+= (p + k - 1)/k;
        }
        return hr <= h;
    }
}