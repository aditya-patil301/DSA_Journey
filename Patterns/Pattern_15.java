import java.util.Scanner;

public class Pattern_15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int column = 2 * num - 1;

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("* ");
            }

            for(int j = 0; j < column - (2 * i) - 2; j++){
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++){
                if(i == num - 1 && j == num - 1){
                    System.out.println();
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}