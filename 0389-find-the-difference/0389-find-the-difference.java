class Solution {
    public char findTheDifference(String s, String t) {
        // code I
        int s_sum = 0;
        int t_sum = 0;
        for(int i = 0; i < s.length(); i++){
            s_sum += (int)s.charAt(i);
        }
        for(int j = 0; j < t.length(); j++){
            t_sum += (int)t.charAt(j);
        }
        return (char)(t_sum - s_sum);
    }
}