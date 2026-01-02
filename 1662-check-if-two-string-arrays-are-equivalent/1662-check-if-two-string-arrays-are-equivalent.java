class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Approach 1
    
    //     StringBuilder sb1 = new StringBuilder();
    //     StringBuilder sb2 = new StringBuilder();
    //     for(String ch : word1){
    //         sb1.append(ch);
    //     }
    //     for(String s : word2){
    //         sb2.append(s);
    //     }
    //     String result = sb1.toString();
    //     String ans = sb2.toString();
    //     return result.equals(ans);


    // Approach 2 
        int m = word1.length;
        int n = word2.length;
        if(m!=n) return false;
        int w1i = 0;
        int i = 0;
        int w2i = 0;
        int j = 0;
        while(w1i < m && w2i < n){
            if(word1[w1i].charAt(i) != word2[w2i].charAt(j)){
                return false;
            }
            i++;
            j++;
            if(i == word1[w1i].length()){
                i=0;
                w1i++;
            }
            if(j == word2[w2i].length()){
                j=0;
                w2i++;
            }
            if(w1i == m && w2i == n){
                return true;
            }
        }
        return false;
    }
}