
class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();

        char[] temp = s1.toCharArray();
        Arrays.sort(temp);
        String sortedS1 = new String(temp);

        for (int i = 0; i <= s2.length() - m; i++) {

            String window = s2.substring(i, i + m);

            char[] arr = window.toCharArray();
            Arrays.sort(arr);

            String sortedWindow = new String(arr);

            if (sortedS1.equals(sortedWindow)) {
                return true;
            }
        }

        return false;
    }
}