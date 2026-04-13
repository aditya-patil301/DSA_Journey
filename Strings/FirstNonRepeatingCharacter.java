import java.util.*;

public class FirstNonRepeatingCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = '1';
        int i = 0;
        int flag = 0;
        while(i < str.length()){
            String subStr = str.substring(0, i) + str.substring(i + 1, str.length());
            if(!subStr.contains("" + str.charAt(i))){
                flag = 1;
                ch = str.charAt(i);
                break;
            } 
                i++;
        }
        if(flag == 1){
            System.out.print(ch);
        } else {
            System.out.print("-" + ch);
        }
    }
}