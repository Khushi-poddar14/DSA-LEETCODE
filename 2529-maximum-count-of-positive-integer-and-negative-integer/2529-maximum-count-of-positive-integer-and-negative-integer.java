class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // count negatives (last index of <0)
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] < 0)
                st = mid + 1;
            else
                end = mid - 1;
        }
        int negcnt = st; // because st = index of first non-negative number

        // count positives (first index of >0)
        st = 0; end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] <= 0)
                st = mid + 1;
            else
                end = mid - 1;
        }
        int poscnt = n - st; // because st = index of first positive number

        return Math.max(negcnt, poscnt);
    }
}
