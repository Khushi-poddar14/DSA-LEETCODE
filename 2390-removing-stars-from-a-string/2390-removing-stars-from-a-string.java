class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.peek());
            st.pop();
        }
        return result.reverse().toString();
    }
}