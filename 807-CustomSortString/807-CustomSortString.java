// Last updated: 8/13/2025, 2:42:09 PM
class Solution {
    public String customSortString(String order, String s) {
        int [] freq  = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        char [] result = new char[s.length()];
        int idx = 0;
        for(char c : order.toCharArray()){
            while(freq[c - 'a'] > 0){
                result[idx++] = c;
                freq[c - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                result[idx++] = (char) (i + 'a');
                freq[i]--;
            }
        }
        return new String(result);
    }
}