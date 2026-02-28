class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m!=n) return false;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!mp.containsKey(ch)) return false;
            mp.put(ch,mp.get(ch)-1);
            if(mp.get(ch)<0) return false;
        }
        return true;
    }
}