// Last updated: 8/13/2025, 2:42:15 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0){
            return true;
        }
        boolean isAllUpper = true;
        boolean isAllLower = true;
        for(char c : word.toCharArray()){
            if(!Character.isUpperCase(c)){
                isAllUpper = false;
            }
            if(!Character.isLowerCase(c)){
                isAllLower = false; 
            }
        }
        if(isAllUpper){
            return true;
        }
        if(isAllLower){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}