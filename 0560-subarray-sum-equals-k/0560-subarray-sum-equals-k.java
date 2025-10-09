class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){       // agr ham j = i + 1 likhte h toh single element subarray skip hojata h
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}