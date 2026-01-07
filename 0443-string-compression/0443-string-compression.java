class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while(i < n){
            char curr = chars[i];
            int count = 0;

            //find count of duplicates
            while(i<n && curr == chars[i]){
                count++;
                i++;
            }

            //Now Assign
            chars[index] = curr;
            index++;
            if(count > 1){
                String cnt = Integer.toString(count);
                for(char ch : cnt.toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}