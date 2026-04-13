import java.util.Scanner;

public class Pattern_24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int count;

        for(int i = n; i > 0; i--){
            count = n;
            for(int j = 0; j < n; j++){
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
        sc.close();
    }
}