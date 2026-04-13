import java.util.Scanner;

public class Pattern_21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of rows you want: ");
        int n = sc.nextInt();

        int count = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("  ");
            }z

            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print(count + " ");
                count++;
            }
            count = 1;

            System.out.println();
        }
        sc.close();
    }
}