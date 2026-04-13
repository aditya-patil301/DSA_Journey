import java.util.Scanner;

public class Pattern_8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int middle = num / 2;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(j == i || j == num - i - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}