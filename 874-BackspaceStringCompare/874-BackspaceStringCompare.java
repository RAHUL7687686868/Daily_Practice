// Last updated: 8/13/2025, 2:42:08 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }
    private String getActual(String str){
        StringBuilder sb = new StringBuilder();
        int hashCount = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            if(hashCount > 0){
                hashCount--;
            }
            else{
                sb.insert(0, str.charAt(i));
            }
        }
        return sb.toString(); 
    }
}