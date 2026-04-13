import java.util.Scanner;

public class Pattern_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an number of rows you want (odd only): ");
        int n = sc.nextInt();

        int rows = 2 * n - 1;
        int middle = rows / 2;

        for(int i = 0; i < (2 * n) - 1; i++){
            for(int j = 0; j < n; j++){
                if(i <= middle){
                    if(j <= i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if(i > middle){
                    if(j < rows - i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
