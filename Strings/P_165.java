import java.util.Scanner;

public class P_165{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        
        String[] arr1 = s.split("\\.");
        String[] arr2 = t.split("\\.");

        int n = Math.max(arr1.length, arr2.length);

        int flag = 0;

        for(int i = 0; i < n; i++){
            int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int num2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            if(num1 < num2) flag = -1;
            if(num1 > num2) flag = 1;
        }

        System.out.print(flag);
    }
}

