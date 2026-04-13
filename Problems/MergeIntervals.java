import java.util.*;
public class MergeIntervals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] ans = new int[n][2];

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0; i < n; i++){
            if(i < n - 1 && arr[i + 1][0] <= arr[i][1]){
                ans[i][0] = arr[i][0];
                ans[i][1] = arr[i + 1][1];
                i++;
            } else {
                ans[i][0] = arr[i][0];
                ans[i][1] = arr[i][1];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}