class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n , mp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(val > 1){
                return true;
            }
        }
        return false;
    }
}