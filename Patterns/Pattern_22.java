import java.util.Scanner;

public class Pattern_22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int count = 1;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - i - 1; j++){
                    System.out.printf("%3s", " ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                    System.out.printf("%3d", count);
                    count++;
            }
            System.out.println();
        }
        sc.close();
    }
}