import java.util.Scanner;

public class TrappingRainWater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int total = 0;

        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];

        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for(int i = 1; i < n; i++){
            total += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        System.out.print(total);
    }
}