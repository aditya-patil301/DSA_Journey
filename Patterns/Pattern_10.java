import java.util.Scanner;

public class Pattern_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int column = 2 * num - 1;
        int flag = 0;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - i - 1; j++){
                    System.out.print("  ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}