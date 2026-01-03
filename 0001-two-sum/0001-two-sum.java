class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(nums[i],i);
        }
        for(int i = 0; i < n; i++){
            sum = target - nums[i];
            if(mp.containsKey(sum) && mp.get(sum)!=i){
                return new int[]{i,mp.get(sum)};
            }
        }
        return new int[]{-1};
    }
}