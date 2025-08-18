// Last updated: 8/18/2025, 2:12:05 PM
public class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        int i = 0;
        while (i + zeros < n) {
            if (arr[i] == 0) {
                if (i + zeros == n - 1) {
                    arr[n - 1] = 0; 
                    n -= 1;
                    break;
                }
                zeros++;
            }
            i++;
        }

        int last = i - 1;
        int writePos = n - 1;
        while (writePos >= 0) {
            arr[writePos] = arr[last];
            writePos--;
            if (arr[last] == 0) {
                arr[writePos] = 0;
                writePos--;
            }
            last--;
        }
    }
}
