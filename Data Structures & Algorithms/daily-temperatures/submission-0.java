class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            // Current temperature is greater
            // than the temperature of the waiting index
            while (!st.isEmpty() &&
                   temperatures[i] > temperatures[st.peek()]) {

                int previous = st.pop();

                // Number of days waited
                ans[previous] = i - previous;
            }

            // Current index now waits for a warmer day
            st.push(i);
        }

        return ans;
    }
}