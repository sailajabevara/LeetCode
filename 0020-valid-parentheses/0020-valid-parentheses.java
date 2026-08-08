
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there is no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.pop();
                // Check if the popped bracket matches the current closing bracket
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        } 
        // If the stack is empty, all brackets were matched correctly
        return st.isEmpty();
    }
}