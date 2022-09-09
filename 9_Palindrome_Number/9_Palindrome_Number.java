class Solution {
    public boolean isPalindrome(int x) {
        boolean palindromeCheck = false;
		int xCopy = x;
		int check = 0;
		if (xCopy >= 0) {
			while (xCopy > 0) {
				check *= 10;
				check += xCopy % 10;
				xCopy /= 10;
			}
		}
		if (x == check) {
			palindromeCheck = true;
		}
		return palindromeCheck;

    }
}