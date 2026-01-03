class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while(i<n){
            char ch = chars[i];
            int count = 0;
            while(i < n && ch == chars[i]){
                count++;
                i++;
            }
            chars[index] = ch;
            index++;
            if(count > 1){
                String result = Integer.toString(count);
                for(char sh : result.toCharArray()){
                    chars[index] = sh;
                    index++;
                }
            }
        }
        return index;
    }
}