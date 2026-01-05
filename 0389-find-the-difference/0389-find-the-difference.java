class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }
        for(int j = 0; j < s.length(); j++){
            char sh = s.charAt(j);
            int idx = sh - 'a';
            freq[idx]--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                return (char)(i + 'a');
            }
        }
        return ' ';
    }
}