import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows you want: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int ans = 1;
            for(int j = 0; j < i + 1; j++){
                System.out.print(ans + " ");
                ans = ans * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
    }
}