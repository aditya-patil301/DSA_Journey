class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count_1 = 0;
        int count_0 = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count_1++;
            } else {
                count_0++;
            }
        }

        StringBuilder ans = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            if(count_1 > 1){
                ans.append('1');
                count_1--;
            } else if(count_0 > 0){
                ans.append('0');
                count_0--;
            } else{
                ans.append('1');
                count_1--;
            }
        }
        return ans.toString();
    }
}