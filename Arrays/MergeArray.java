import java.util.*;

public class MergeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i < n; i++){
            arr_1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int m = sc.nextInt();
        int[] arr_2 = new int[m];
        System.out.println("Enter the elements of second array: ");
        for(int i = 0; i < m; i++){
            arr_2[i] = sc.nextInt();
        }

        int s = m + n;
        int[] ans = new int[s];
        for(int i = 0; i < n; i++){
            ans[i] = arr_1[i];
        }

        for(int i = 0; i < m; i++){
            ans[n + i] = arr_2[i];
        }
        
        Arrays.sort(ans);

        for(int i = 0; i < s; i++){
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
