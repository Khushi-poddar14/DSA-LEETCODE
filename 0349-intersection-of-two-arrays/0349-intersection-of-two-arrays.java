class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int i = 0;
        HashSet<Integer> s = new HashSet<>();
        for(int n : nums1){
            s.add(n);
        }
        for(int m : nums2){
            if(s.contains(m)){
                arr[i++] = m;
                s.remove(m);
            }
        }
        return Arrays.copyOf(arr,i);
    }
}