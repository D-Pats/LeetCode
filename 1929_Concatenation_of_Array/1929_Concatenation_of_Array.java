class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLen = nums.length;
        int[] outputArray = new int[(nums.length * 2)];
		int loops = 2;
		while (loops > 0) {
			if (loops > 1) {
				for (int index = 0; index < numsLen; index++) {
					outputArray[index] = nums[index];
				} loops -= 1;
			} else {
				for (int index = numsLen; index < numsLen * 2; index++) {
					outputArray[index] = nums[index - numsLen];
				} loops -= 1;
			}
		}
		return outputArray;
    }
}