import java.util.Scanner;

public class Pattern_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number of rows you want (odd only): ");
        int num = sc.nextInt();

        int middle = num / 2;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i <= middle){
                    if(j == middle - i || j == middle + i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(j == i - middle || j == num + middle - i - 1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}