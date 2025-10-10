class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi = 0;
        int ni = 1;
        int n = nums.length;
        int[] arr = new int[n];
        for(int num : nums){
            if(num > 0){
                arr[pi] = num;
                pi += 2;
            }
            else{
                arr[ni] = num;
                ni += 2;
            }
        }
        return arr;
    }
}