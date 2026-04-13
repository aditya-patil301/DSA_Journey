import java.util.Scanner;

public class TransposeAnArray {
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

        int[][] arr_2 = new int[n][m];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         arr_2[i][j] = arr[j][i];
        //     }
        // }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        System.out.println("The elements of an array are: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}