class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;

        Set<Integer> hs = new HashSet<>();
        for(int num:nums) {
            hs.add(num);
        }

        for(int num: nums) {
            int streak = 0, curr = num;
            while(hs.contains(curr)) {
                streak++;
                curr++;
            }
            count = Math.max(count, streak);
            // System.out.println(count);
        }

        return count;
    }
}
