class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, i = right;
        int[] result = new int[nums.length];
        while(i >= 0) result[i--] = (Math.abs(nums[left]) > Math.abs(nums[right])) ? nums[left]*nums[left++] : nums[right]*nums[right--]; 
        return result;
    }
}