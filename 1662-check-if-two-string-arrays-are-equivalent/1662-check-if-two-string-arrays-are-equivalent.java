class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String ch : word1){
            sb1.append(ch);
        }
        for(String s : word2){
            sb2.append(s);
        }
        String result = sb1.toString();
        String ans = sb2.toString();
        return result.equals(ans);
    }
}