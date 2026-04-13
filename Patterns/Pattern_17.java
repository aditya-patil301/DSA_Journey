import java.util.Scanner;

public class Pattern_17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an number: ");
        int n = sc.nextInt();

        int rows = (2 * n) - 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2 * i; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = rows - n - 1; i >= 0; i--){    // rows - n - 1 == n - 2
            for(int j = 0; j < 2 * i; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }      
        
    }
}
