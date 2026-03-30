class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int s = 0;
        int ms = nums[0];
        for(int i = 0; i < n; i++){
            s += nums[i];
            ms = Math.max(s,ms);
            if(s < 0){
                s = 0;
            }
        }
        return ms;
    }
}