import java.util.Scanner;

public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int l = 0;
            int r = n - 1;

            while(l <= r){
                System.out.print(arr[l] + " ");
                if(l != r){
                    System.out.print(arr[r] + " ");
                }
                l++;
                r--;
            }
        }
        sc.close();
    }
}
