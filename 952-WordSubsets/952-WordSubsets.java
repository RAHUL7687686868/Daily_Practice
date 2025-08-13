// Last updated: 8/13/2025, 2:42:02 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int maxFreq[] = new int [26];
        for(String s : words2){
            int [] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                maxFreq[i] = Math.max(maxFreq[i], freq[i]); 
            }
        }
        List<String> result = new ArrayList<>();
        for(String s : words1){
            int[] freq = new int [26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
            boolean ss = true;
            for(int i = 0; i < 26; i++){
                if(freq[i] < maxFreq[i]){
                    ss = false;
                    break;
                }
            }
            if(ss){
                result.add(s);
            }
        }
        return result;
    }
}