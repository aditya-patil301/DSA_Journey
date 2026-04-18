class Solution {
    static int reverseNum(int n){
        int num = 0;
        while(n != 0){
            int lastDigit = n % 10;
            num = (num * 10) + lastDigit;
            n = n / 10;
        }
        return num;
    }
    
    public int mirrorDistance(int n) {
        return Math.abs(n - reverseNum(n));
    }
}