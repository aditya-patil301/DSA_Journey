class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){
                ans.add(nums[i]);
            } else {
                tracker.put(nums[i], 1);
            }
        }

        return ans;
    }
}