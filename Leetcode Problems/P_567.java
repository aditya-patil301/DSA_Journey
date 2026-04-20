// BRUTE FORCE

// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s2.length() < s1.length()){
//             return false;
//         }

//         char[] arr = s1.toCharArray();
//         Arrays.sort(arr);

//         int flag = 0;
//         int i = 0;
//         while(i <= s2.length() - s1.length()){
//             String str = s2.substring(i, s1.length() + i);
//             char[] strArr = str.toCharArray();
//             Arrays.sort(strArr);
//             if(Arrays.equals(strArr, arr)){
//                 flag = 1;
//             }
//             i++;
//         }
        
//         if(flag == 1){
//             return true;
//         }

//         return false;
//     }
// }



// USING SLIDING WINDOW

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) return true;

        for(int i = s1.length(); i < s2.length(); i++){
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(arr1, arr2)){
                return true;
            }
        }
        return false;
    }
}
