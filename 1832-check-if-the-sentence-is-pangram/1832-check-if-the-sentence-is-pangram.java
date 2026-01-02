class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int[] freq = new int[26];
        for(char ch : sentence.toCharArray()){
            int index = ch - 'a';
            freq[index]++;
        }
        for(int i = 0; i < 26;i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
}