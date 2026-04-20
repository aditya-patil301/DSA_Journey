class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

        String x = arr[0];
        String y = arr[arr.length - 1];

        int i = 0;
        while(i < x.length() && i < y.length()){
            if(x.charAt(i) != y.charAt(i)){
                break;
            }
            i++;
        }
        return x.substring(0, i);
    }
}





// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String ans = "";
//         String smallest = strs[0];

//         for(int i = 0; i < strs.length; i++){
//             if(strs[i].length() < smallest.length()){
//                 smallest = strs[i];
//             }
//         }

//         int count = 0;

//         while(count < smallest.length()){
//             for(int i = 0; i < strs.length; i++){
//                 if(strs[i].charAt(count) != smallest.charAt(count)){
//                     return ans;
//                 }
//             }
//             ans = ans + smallest.charAt(count);
//             count++;
//         }
//         return ans;
//     }
// }