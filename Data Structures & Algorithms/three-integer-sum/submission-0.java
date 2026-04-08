class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        
                        Collections.sort(temp); // avoid duplicates like [-1,0,1] vs [0,-1,1]
                        
                        if (!list.contains(temp)) {
                            list.add(temp);
                        }
                    }
                }
            }
        }
        
        return list;
    }
}