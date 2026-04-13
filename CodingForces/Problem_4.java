import java.util.Scanner;

public class Problem_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = 0;
            int i = 0;

            while(i < str.length()){
                if(str.charAt(i) == 'W'){
                    i++;
                } else {
                    i += (k - 1);
                    count++;
                    i++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
