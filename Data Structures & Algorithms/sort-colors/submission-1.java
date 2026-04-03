class Solution {
    public void sortColors(int[] nums) {
        // Three pointers -> swap each other
        int zero = 0, one = 0, two = nums.length - 1;
        while(one <= two) {
            if(nums[one] == 0) {
                // swap 0  and 1
                swap(nums, zero, one);
                zero++;
                one++;
            } else if(nums[one] == 1) {
                one++;
            } else {
                swap(nums, one, two);
                two--;
            }
        }
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}