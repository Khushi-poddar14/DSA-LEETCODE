class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int n = chars.length;
        int index = 0;
        while(i<n){
            int count = 0;
            char ch = chars[i];
            while(i < n && ch == chars[i]){
                count++;
                i++;
            }
            chars[index] = ch;
            index++;
            if(count > 1){
                String cnt = Integer.toString(count);
                for(char c : cnt.toCharArray()){
                    chars[index] = c;
                    index++;
                }
            }
        }
        return index;

    }
}