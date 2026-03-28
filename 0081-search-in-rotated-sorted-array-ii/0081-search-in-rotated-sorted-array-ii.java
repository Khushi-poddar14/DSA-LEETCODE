class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[st] && nums[end] == nums[mid]){
                st++;
                end--;
            }
            else if(nums[st] <= nums[mid]){
                if(nums[st] <= target && nums[mid] > target){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && nums[end] >= target){
                    st = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return false;
    }
}