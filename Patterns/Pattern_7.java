import java.util.Scanner;

public class Pattern_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want in triangle: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < 2 * i; j++){
                    System.out.print("  ");
            }
            for(int j = 0; j < num - i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}