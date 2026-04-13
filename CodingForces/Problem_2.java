import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

            int l = 0;
            int r = n - 1;
            int length = 0;

            while(l <= r){
                if(str.charAt(l) != str.charAt(r)){
                    l++;
                    r--;
                } else {
                    length = r - l + 1;
                    break;
                }
            }
            System.out.println(length);
        }
        sc.close();
    }
}
