class Solution {
    public int characterReplacement(String s, int k) {
        int[] tracker = new int[26];
        int left = 0;
        int max = 0;
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            tracker[s.charAt(i) - 'A']++;

            max = Math.max(max, tracker[s.charAt(i) - 'A']);

            while(((i - left + 1) - max) > k){
                tracker[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}