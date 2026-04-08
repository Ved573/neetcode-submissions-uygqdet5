class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Step 1: Create HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2: Traverse each word
        for (String s : strs) {

            // Convert to char array
            char[] arr = s.toCharArray();

            // Sort characters
            Arrays.sort(arr);

            // Make key
            String key = new String(arr);

            // Step 3: If key not present, create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Step 4: Add original word
            map.get(key).add(s);
        }

        // Step 5: Return all groups
        return new ArrayList<>(map.values());
    }
}