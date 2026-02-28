class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }
        for(int val : mp.values()){
            if(val > 1) return true;
        }
        return false;
    }
}