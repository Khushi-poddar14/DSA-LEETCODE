class Solution {
    public int reverse(int n) {
        long num = 0;
        while(n != 0){
            int ld = n %10;
            num = num * 10 + ld;
            n = n / 10;
        }
        if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE){
            return 0;
        }
        return (int)num;
    }
}