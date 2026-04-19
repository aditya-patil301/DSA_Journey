class Solution {
    public int firstStableIndex(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for(int j = 0; j <= i; j++){
                largest = Math.max(largest, nums[j]);
            }

            for(int k = i; k < nums.length; k++){
                smallest = Math.min(smallest, nums[k]);
            }

            if((long)largest - smallest <= x){
                return i;
            }
        }
        return -1;
    }
}