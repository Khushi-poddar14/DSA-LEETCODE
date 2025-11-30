class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int op=0;
        for(int i = 0; i < n; i++){
            if(nums[i]%3!=0){
                if((nums[i] + 1)%3==0){
                    op++;
                }
                else{
                    nums[i]--;
                    op++;
                }
            }
        }
        return op;
    }
}