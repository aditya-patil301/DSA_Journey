import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of an array: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns of an array: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        } 

        System.out.println("The elements of an array are: ");
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for(int j = m - 1; j >= 0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }

        sc.close();
    }
}