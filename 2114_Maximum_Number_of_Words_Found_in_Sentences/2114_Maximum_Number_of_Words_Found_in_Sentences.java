class Solution {
    public int mostWordsFound(String[] sentences) {
		int spaces = 0;
		int highestSpaces = 0;
		for (String sentence : sentences) {
			for (int chars = 0; chars < sentence.length(); chars++) {
				if (sentence.charAt(chars) == ' ') {
					spaces++;
				}
				if (spaces > highestSpaces) {
					highestSpaces = spaces;
				}

			}
			spaces = 0;
		}
		return highestSpaces + 1;
    }
}