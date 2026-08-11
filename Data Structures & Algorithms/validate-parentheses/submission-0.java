class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening bracket → PUSH
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }

            // Closing bracket → POP and MATCH
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if (top == '(' && c != ')') {
                    return false;
                }

                if (top == '{' && c != '}') {
                    return false;
                }

                if (top == '[' && c != ']') {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}