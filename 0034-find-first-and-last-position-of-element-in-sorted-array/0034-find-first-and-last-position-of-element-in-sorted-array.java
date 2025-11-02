class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int[] arr = {-1,-1};

        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target){
                arr[0] = mid;
                end = mid - 1;
            }
            else if(target > nums[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        st = 0;
        end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target){
                arr[1] = mid;
                st = mid + 1;
            }
            else if(target > nums[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr;
    }
}