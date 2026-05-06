

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums); // This modifies 'nums' directly
        return nums;       // Return the now-sorted 'nums'
    }
}