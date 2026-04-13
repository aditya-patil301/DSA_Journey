import java.util.Scanner;

public class SpiralMatrix {
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

        int sr = 0;
        int er = arr.length - 1;
        int scc = 0;
        int ec = arr[0].length - 1;

        System.out.println("The elements of an array are: ");
        while(sr <= er && scc <= ec){
            for(int i = scc; i <= ec; i++){
                System.out.print(arr[sr][i] + " ");
            }
            sr++;

            for(int i = sr; i <= er; i++){
                System.out.print(arr[i][ec] + " ");
            }
            ec--;

            for(int i = ec; i >= scc; i--){
                System.out.print(arr[er][i] + " ");
            }
            er--;

            for(int i = er; i >= sr; i--){
                System.out.print(arr[i][scc] + " ");
            }
            scc++;
        }
        

        sc.close();
    }
}


