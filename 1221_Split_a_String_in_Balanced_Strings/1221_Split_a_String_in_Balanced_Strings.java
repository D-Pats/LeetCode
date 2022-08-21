class Solution {
    public int balancedStringSplit(String s) {
		int r = 0;
		int l = 0;
		int output = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				r++;
				if (r == l && r > 0) {
					output++;
					r = 0;
					l = 0;
				}
			} else {
				l++;
				if (r == l && r > 0) {
					output++;
					r = 0;
					l = 0;
				}
			}
		}
        return output;
    }
}