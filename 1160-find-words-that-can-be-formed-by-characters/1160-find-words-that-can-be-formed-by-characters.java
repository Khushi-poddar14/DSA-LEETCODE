class Solution {
    public int countCharacters(String[] words, String chars) {
        // int[] charCount = new int[26];

        // for(char ch : chars.toCharArray()){
        //     charCount[ch - 'a']++;
        // }

        // int result = 0;  // to store length of good string

        // for(String word : words){
        //     int[] wordCount = new int[26];  // loop ke andr array isliye bnaya h becz har array ki apni character frequency hogi

        //     for(char sh : word.toCharArray()){
        //         wordCount[sh - 'a']++;
        //     }

        //     boolean ok = true;

        //     for(int i = 0; i < 26; i++){
        //         if(wordCount[i] > charCount[i]){
        //             ok = false;
        //             break;
        //         }
        //     }

        //     if(ok == true){
        //         result += word.length();
        //     }
        // }
        // return result;






















        int[] charfreq = new int[26];
        for(char ch : chars.toCharArray()){
            charfreq[ch - 'a']++;
        }
        int result = 0;
        for(String word : words){
            int[] wordfreq = new int[26];
            boolean ok = true;
            for(char ch : word.toCharArray())
            {
                wordfreq[ch - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                if(wordfreq[i] > charfreq[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                result += word.length();
            }
        }
        return result;
    }
}