import java.util.*;
public class K_Max_Element{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n - k + 1];

        for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i <= n - k; i++){
            int largest = arr[i];
			for(int j = i; j < i + k; j++){
                if(arr[j] > arr[i]){
                    largest = arr[j];
                }
            }
            ans[i] = largest;
		}

		for(int i = 0; i < n - k + 1; i++){
			System.out.print(ans[i] + " ");
		}
		sc.close();
    }
}