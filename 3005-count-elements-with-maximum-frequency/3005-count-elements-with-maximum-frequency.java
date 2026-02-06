class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1);
        }
        int max = 0;
        for(int j : mp.values()){
            max = Math.max(j , max);
        }
        int cnt = 0;
        for(int freq : mp.values()){
            if(freq == max){
                cnt++;
            }
        }
        return cnt*max;
    }
}