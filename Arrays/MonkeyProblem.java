import java.util.Scanner;

public class MonkeyProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        

        while(m > 0 && n > 0){
            m -= k;
            n--;
        }

        while(p > 0 && n > 0){
            p -= j;
            n--;
        }

        System.out.print(n);
        sc.close();
    }
}