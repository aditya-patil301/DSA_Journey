class Solution {
    static boolean isPossible(int[] weights, int days, int max){
        int m = 1;
        int sum = 0;

        for(int i = 0; i < weights.length; i++){
            if(sum + weights[i] <= max){
                sum += weights[i];
            } else {
                m++;
                sum = weights[i];
            }

            if(m > days){
                return false;
            }
        }
        return true;
    }

    static int solve(int[] weights, int days, int low, int high){
        if(low > high){
            return low;
        }

        int mid = low + (high - low) / 2;
        if(isPossible(weights, days, mid)){
            return solve(weights, days, low, mid - 1);
        } else {
            return solve(weights, days, mid + 1, high);
        }
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int l = weights[0];
        int h = 0;

        for(int i = 0; i < weights.length; i++){
            l = Math.max(l, weights[i]);
            h += weights[i];
        }

        return solve(weights, days, l, h);

    }
}