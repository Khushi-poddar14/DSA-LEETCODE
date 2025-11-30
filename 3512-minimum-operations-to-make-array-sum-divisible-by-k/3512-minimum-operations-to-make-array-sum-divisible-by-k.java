class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int op = 0;
        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
        }
        // while(sum % k != 0){
        //     sum--;
        //     op++;
        // }
        // return op;
        return sum%k;
    }
}