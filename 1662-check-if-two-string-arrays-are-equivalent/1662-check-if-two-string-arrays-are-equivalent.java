class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String a : word1){
            sb1.append(a);
        }
        for(String b : word2){
            sb2.append(b);
        }
        String result = sb1.toString();
        String ans = sb2.toString();
        return result.equals(ans);
    }
}