class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        if(s.size() != nums.length) return true;
        return false;
    }
}