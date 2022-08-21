class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output= new int[nums.length];
        int smallerCount =  0;
        for (int i= 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallerCount++;
                }
                output[i] = smallerCount;
            }
            smallerCount = 0;
        }
        return output;
    }
}