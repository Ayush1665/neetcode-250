class Solution {
    public int shipWithinDays(int[] w, int d) {
        int l = 0, r = 0;

        for (int x : w) {
            l = Math.max(l, x);
            r += x;
        }

        while (l < r) {
            int m = (l + r) / 2;
            int days = 1, load = 0;

            for (int x : w) {
                if (load + x > m) {
                    days++;
                    load = 0;
                }
                load += x;
            }

            if (days <= d) r = m;
            else l = m + 1;
        }

        return l;
    }
}