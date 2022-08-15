class Solution {
    public int maximumWealth(int[][] accounts) {
        int accLen = accounts.length;
        int arr[] = new int[accLen];
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        int output = arr[0];
        for (int num : arr) {
            if (num >= output) {
                output = num;
            }
        }
        return output;
    }
}