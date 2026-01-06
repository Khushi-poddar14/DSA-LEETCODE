class Solution {
    public char findTheDifference(String s, String t) {
        // code I
        // int s_sum = 0;
        // int t_sum = 0;
        // for(int i = 0; i < s.length(); i++){
        //     s_sum += (int)s.charAt(i);
        // }
        // for(int j = 0; j < t.length(); j++){
        //     t_sum += (int)t.charAt(j);
        // }
        // return (char)(t_sum - s_sum);


        // code II
        int[] freq = new int[26];
        for(int i = 0; i < t.length(); i++){
            int index = t.charAt(i) - 'a';
            freq[index]++;
        }
        for(int j = 0; j < s.length(); j++){
            int idx = s.charAt(j) - 'a';
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