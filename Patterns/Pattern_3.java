import java.util.Scanner;

public class Pattern_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want in triangle: ");
        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}