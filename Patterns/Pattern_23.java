import java.util.Scanner;

public class Pattern_23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int count_1 = 1;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - i - 1; j++){
                    System.out.printf("%3s", " ");
            }

            for(int j = 0; j < i + 1; j++){
                    System.out.printf("%3d", count_1);
                    count_1++;
            }

            int count_2 = i;
            for(int j = 1; j < i + 1; j++){
                System.out.printf("%3d", count_2);
                count_2--;
            }

            count_1 = 1;

            System.out.println();
        }
        sc.close();
    }
}