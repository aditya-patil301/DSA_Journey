import java.util.Scanner;

public class Pattern_25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int count;

        for(int i = 0; i < n; i++){
            count = n;
            for(int j = 0; j < n; j++){
                if(j == n - i - 1){
                    System.out.print("* ");
                    count--;
                } else{
                    System.out.print(count + " ");
                    count--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}