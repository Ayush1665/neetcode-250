public class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(0, nums, 0);
    }

    private int backtrack(int i, int[] nums, int currentXor) {
        if (i == nums.length)
            return currentXor;

        int in = backtrack(i + 1, nums, currentXor ^ nums[i]);
        int ex = backtrack(i + 1, nums, currentXor);
        return in + ex;
    }
}