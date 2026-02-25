class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n,0) + 1);
        }
        int max = 0;
        for(int val : mp.values()){
            max = Math.max(max,val);
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