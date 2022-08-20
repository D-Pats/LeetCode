class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int subtotal = 0;
        for (int i = 0; i < nums.length; i++){
            subtotal += nums[i];
            output[i] = subtotal;
        }
        return output;
    }
}