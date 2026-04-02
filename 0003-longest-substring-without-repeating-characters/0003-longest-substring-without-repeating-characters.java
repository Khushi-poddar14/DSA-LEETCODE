class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int n = s.length();
        int l = 0;
        int ml = 0;
        for(int r = 0; r < n; r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            ml = Math.max(ml,r-l+1);
        }
        return ml;
    }
}