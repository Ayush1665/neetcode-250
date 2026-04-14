class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        for(int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];

            for (int j = i; j < heights.length; j++) {
                // pick min height
                minHeight = Math.min(minHeight, heights[j]);
                // cal. max area
                int width = j - i + 1;
                area = Math.max(minHeight * width, area);
            }
        }
        return area;
    }
}
