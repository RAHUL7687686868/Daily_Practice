// Last updated: 8/17/2025, 10:15:54 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int srt = 0;
        int end = arr.length - 1;
        while(srt < end){
            int mid = srt + (end - srt)/ 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                srt = mid + 1;
            }
        }
        return srt;
    }
}