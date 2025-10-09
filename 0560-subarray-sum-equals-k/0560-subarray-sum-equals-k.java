class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}

// basically j = i isliye likha h becz the possible subarrays for [1,2,3] are [1], [2], [3], [1,2], [2,3] , 
//we have written sum += nums[j] becz ham ek baar nums[i] ki value toh sum m store krva hi rhe hai toh ab jaise jaise j aage bdhega sirf uski value add krne ki zrurat hai hme , 
//sum = 0 loop ke andr isliye likha h becz if the value of sum doesnt matches the if condition we reset the sum again to 0 becz hme contigous subarray chahhiye 