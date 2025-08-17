// Last updated: 8/17/2025, 9:56:12 PM
class Solution {
    public int compress(char[] chars) {
    int write = 0; 
    int read = 0;  

    while (read < chars.length) {
        char currentChar = chars[read];
        int count = 0;
        while (read < chars.length && chars[read] == currentChar) {
            read++;
            count++;
        }

        chars[write++] = currentChar;
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[write++] = c;
            }
        }
    }
    return write; 
    }
}