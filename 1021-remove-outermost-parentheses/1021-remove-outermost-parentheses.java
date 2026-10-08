class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    res.append(ch);
                }st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    res.append(ch);
                }
            }
        }
        return res.toString();

    }
}