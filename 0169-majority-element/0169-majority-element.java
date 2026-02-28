class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int a : nums){
            mp.put(a, mp.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(v > n/2){
                return k;
            }
        }
        return -1;
    }
}