class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> en: map.entrySet()) {
            if(en.getValue() > nums.length / 2) {
                return en.getKey();
            }
        }
        return -1;
    }
}