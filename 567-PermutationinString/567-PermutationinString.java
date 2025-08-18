// Last updated: 8/18/2025, 1:01:31 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for (int i = 0; i < len1; i++) {
            freqS1[s1.charAt(i) - 'a']++;
            freqS2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= len2 - len1; i++) {
            if (i > 0) {
                freqS2[s2.charAt(i - 1) - 'a']--;
                freqS2[s2.charAt(i + len1 - 1) - 'a']++;
            }
            if (matches(freqS1, freqS2)) {
                return true;
            }
        }
        return false;
    }
    private boolean matches(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}