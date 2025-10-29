class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};

        // First occurrence
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] > target) {
                end = mid - 1;   // store first index
                  // keep searching left side
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                ans[0] = mid;
                end = mid - 1;
            }
        }

        // Last occurrence
        st = 0;
        end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;   // store last index
                st = mid + 1;   // keep searching right side
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
