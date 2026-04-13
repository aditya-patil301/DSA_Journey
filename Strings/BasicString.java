import java.util.Scanner;

public class BasicString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Initialization And Declaration
        // String str;
        // str = "Aditya";

        //Initialization with Declaration
        // String str = "Aditya";

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("You enter: " + str);

        //Properties

        String copyStr = str;
        System.out.println("Copied string: " + copyStr);

        System.out.println("Length of a string: " + str.length());

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Concatenation of a string
        // String str2 = " Patil";
        // str = str + str2;
        str = str + " Patil";
        System.out.println("After concatenation: " + str);

        // Substring
        String str2 = str.substring(0, str.length());   // 6 is excluded means substring will printed till 5
        System.out.println("Substring of an str is: " + str.substring(0, 6));


        // Equal Functions
        System.out.println(str.equals(str2));

        // Lexicographical comparision - We use compareTo() function to check
        // Syntax - str1.compareTo(str2);
        // Output - 0 if strings are equal, -ve if str1 comes before str2, +ve if str1 comes after str2

        // 65 - 90 - Capital A - Z
        // 97 - 122 - Capital a - z

        System.out.println(str.compareTo(str2));
        System.out.println("Aditya".compareTo("Naveshwar"));
        System.out.println("Naveshwar".compareTo("Aditya"));


        // String to number
        String numString = "123";
        int n = Integer.parseInt(numString);
        System.out.println(n % 10);

        sc.close();
    }
}


// !ans.contains(String.valueOf(s.charAt(i)))  -- contains method se check karte hai ki particular character or string us badi string me hai yaa nahi
// !ans.contains("" + s.charAt(i))

// String str = s.replaceAll("[^a-zA-Z0-9]", "");
// String ans = str.toLowerCase();

// function to check the charAt(i) is alphanumeric character or not -- Character.isLetterOrDigit(char ch);


// LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS
// int[] last = new int[128];
// int l = 0;
// int maxLen = 0;

// for(int r = 0; r < s.length(); r++){
//     l = Math.max(l, last[s.charAt(r)]);
//     maxLen = Math.max(maxLen, r - l + 1);
//     last[s.charAt(r)] = r + 1;
// }

// return maxLen;




// Valid Palindrome
// class Solution {
//     public boolean isPalindrome(String s) {
//         String str = s.replaceAll("[^a-zA-Z0-9]", "");
//         String ans = str.toLowerCase();

//         int l = 0;
//         int r = ans.length() - 1;
//         while(l <= r){
//             if(ans.charAt(l) != ans.charAt(r)){
//                 return false;
//             }
//             l++;
//             r--;
//         }
//         return true;
//     }
// }
