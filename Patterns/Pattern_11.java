import java.util.Scanner;

public class Pattern_11{
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
                if(flag == 0){
                    System.out.print("* ");
                    flag = 1;
                } else if(flag == 1){
                    System.out.print("! ");
                    flag = 0;
                }
            }
            flag = 0;
            System.out.println();

            // for(int j = 0; j < 2 * i + 1; j++){
            //     if(j % 2 == 0){
            //         System.out.print("* ");
            //     } else {
            //         System.out.print("! ");
            //     }
            // }
            // System.out.println();
        }
        sc.close();
    }
}