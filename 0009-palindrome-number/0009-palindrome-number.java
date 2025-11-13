class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y = x;
        int result=0;
        while(y>0){
            int ld = y%10;
            result=result*10+ld;
            y=y/10;
        }
        if(result==x){
            return true;
        }
        return false;
    }
}