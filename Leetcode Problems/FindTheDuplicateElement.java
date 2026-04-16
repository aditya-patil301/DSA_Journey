class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){
                int value = tracker.get(nums[i]);
                tracker.put(nums[i], value + 1);
            } else {
                tracker.put(nums[i], 1);
            }
        }

        for(int it: tracker.keySet()){
            if(tracker.get(it) > 1){
                return it;
            }
        }

        return 0;
    }
}