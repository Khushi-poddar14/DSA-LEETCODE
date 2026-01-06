class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char maxchar = ' ';
        for(int i = 2; i < n; i++){
            char a = num.charAt(i);
            char b = num.charAt(i-1);
            char c = num.charAt(i-2);
            if(a==b && a == c){
                if(maxchar == ' ' || a > maxchar){
                    maxchar = a;
                }
            }
        }
        if(maxchar == ' '){
            return "";
        }
        return "" + maxchar+maxchar+maxchar;
    }
}