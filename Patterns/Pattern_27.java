import java.util.Scanner;

public class Pattern_27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int mid;

        int count;

        for(int i = 0; i < n; i++){
            count = n - i;
            for(int j = 0; j < n - i; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                mid = ((2 * i) + 1) / 2;
                if(j < mid){
                    System.out.printf(count + " ");
                    count++;
                } else if(j == mid){
                    System.out.print("0 ");
                } else if(j > mid){
                    count--;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}