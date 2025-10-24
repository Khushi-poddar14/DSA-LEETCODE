class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return st;
    }
}