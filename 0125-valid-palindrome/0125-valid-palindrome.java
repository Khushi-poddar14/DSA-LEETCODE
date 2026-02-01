class Solution {
    public static String rev(char[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]" , "");
        char[] arr = s.toCharArray();
        String ans = rev(arr);
        if(ans.equals(s)) return true;
        return false;
    }
}