class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()==1) return false;
        Stack<Character> st= new Stack<>();
        boolean result=true;
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && ( 
                (ch==']' && st.peek()=='[') ||
                (ch==')' && st.peek()=='(') ||
                (ch=='}' && st.peek()=='{') 
                )
                ){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return result=(st.size()==0)?true:false;
    }
}
