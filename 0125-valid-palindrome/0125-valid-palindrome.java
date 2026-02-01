class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] arr = s.toCharArray();
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while(i < j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;

    }
}