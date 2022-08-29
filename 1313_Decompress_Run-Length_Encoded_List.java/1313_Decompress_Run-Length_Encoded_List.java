class Solution {
    public int[] decompressRLElist(int[] nums) {
		int size = 0;
		int freq = 0;
		for (int i = 0; i < nums.length; i += 2) {
			size += nums[i];
		}
		int[] output = new int[size];
		size = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				size += nums[i];
				freq = nums[i];
			} else {
				int freqArr = size - freq;
				for (int j = freqArr; j < size; j++) {
					output[j] = nums[i];
				}
			}
		}
        return output;
    }
}