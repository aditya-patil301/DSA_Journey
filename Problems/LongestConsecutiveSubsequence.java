import java.util.*;
public class LongestConsecutiveSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int ans = 1;

        int index = 1;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] != arr[i]){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        for(int i = 0; i < n - 1; i++){
            int count = 1;
            while(i < n - 1 && arr[i + 1] - arr[i] == 1){
                count++;
                i++;
            }
            ans = Math.max(count, ans);
        }
        System.out.println(ans);
    }
}