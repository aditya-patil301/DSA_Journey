import java.util.Scanner;

public class Pattern_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want in triangle: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(j < num - i - 1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}