class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int l = 0;
        int r = arr.length - 1;
        int boat = 0;
        Arrays.sort(arr);

        while(l <= r){
            if(arr[l] + arr[r] <= limit){
                boat++;
                r--;
                l++;
            } else {
                r--;
                boat++;
            }
        }
        return boat;
    }
}