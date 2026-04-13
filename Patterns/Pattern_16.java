import java.util.Scanner;

public class Pattern_16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an number of rows you want (odd only): ");
        int n = sc.nextInt();

        int rows = 2 * n - 1;
        int middle = rows / 2;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
