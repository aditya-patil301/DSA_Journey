import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        int flag = 0;

        int i = 0;
        while(i < s.length()){
            int j = i;
            int count = 0;
            String ans = "";

            while(count < s.length()){
                ans += s.charAt(j);
                j = (j + 1) % s.length();
                count++;
            }

            i++;
            
            if(t.equals(ans)){
                flag = 1;
            } 
        }

        if(flag == 1){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

        sc.close();
    }
}

