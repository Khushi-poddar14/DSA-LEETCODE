class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int idx = -1;
        int poscnt = 0;
        int negcnt = 0;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] < 0){
                idx = mid;
                st = mid + 1;
                negcnt = st;
            } 
            else{
                end = mid - 1;
            }
        }
        st = 0;
        end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] > 0){
                idx = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
            poscnt = n - idx;
        }
        return Math.max(negcnt,poscnt);
    }
}