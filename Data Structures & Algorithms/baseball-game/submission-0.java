class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            // Normal number → push it into stack
            if (!op.equals("+") && !op.equals("D") && !op.equals("C")) {

                int num = Integer.parseInt(op);
                st.push(num);
            }

            // "+" → sum of previous two scores
            else if (op.equals("+")) {

                int last = st.pop();
                int secondLast = st.peek();

                int newScore = last + secondLast;

                st.push(last);
                st.push(newScore);
            }

            // "D" → double the previous score
            else if (op.equals("D")) {

                int newScore = 2 * st.peek();
                st.push(newScore);
            }

            // "C" → remove previous score
            else if (op.equals("C")) {

                st.pop();
            }
        }

        // Add all scores
        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}