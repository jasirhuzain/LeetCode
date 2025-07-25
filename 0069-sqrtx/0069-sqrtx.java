class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // because root of 0 and 1 is themselves

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            if (square < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
