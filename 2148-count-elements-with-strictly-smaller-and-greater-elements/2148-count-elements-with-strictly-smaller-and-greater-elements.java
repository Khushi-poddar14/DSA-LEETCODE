class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int count = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            else if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > min && nums[i] < max) count++;
        }
        return count;
    }
}