class Solution {
    public char repeatedCharacter(String s) {
        char output = ' ';
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j < count) {
                        output = s.charAt(j);
                        count = j;
                    }
                }
            }
        }
        return output;
    }
}