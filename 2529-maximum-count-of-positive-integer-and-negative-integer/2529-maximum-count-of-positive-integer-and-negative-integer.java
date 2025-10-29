class Solution {
    public int maximumCount(int[] nums) {
        int negmax = 0;
        int posmax = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) continue;
            if(nums[i] < 0){
                negmax++;
            }
            else{
                posmax++;
            }
        }
        return Math.max(negmax , posmax);
    }
}