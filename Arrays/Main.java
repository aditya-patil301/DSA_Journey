// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); 
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
// 			arr[i] = sc.nextInt();
// 		}

// 		int zeroIndex = 0;
// 		int oneIndex = zeroIndex + 1;
// 		int temp;

// 		for(int i = 0; i < n; i++){
// 			if(arr[i] == 0){
// 				temp = arr[zeroIndex];
// 				arr[zeroIndex] = arr[i];
// 				arr[i] = temp;
// 				zeroIndex++;
// 			}

// 			if(arr[i] == 1){
// 				temp = arr[oneIndex];
// 				arr[oneIndex] = arr[i];
// 				arr[i] = temp;
// 				oneIndex++;
// 			}
// 		}

// 		for(int i = 0; i < n; i++){
// 			System.out.print(arr[i] + " ");
// 		}
// 		sc.close();
//     }
// }


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		int zeroIndex = 0;
		int oneIndex = zeroIndex + 1;
		int temp;

		for(int i = 0; i < n; i++){
			if(arr[i] == 0){
				temp = arr[zeroIndex];
				arr[zeroIndex] = arr[i];
				arr[i] = temp;
				zeroIndex++;
			}

			if(arr[i] == 1){
				temp = arr[oneIndex];
				arr[oneIndex] = arr[i];
				arr[i] = temp;
				oneIndex++;
			}
		}

		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		sc.close();
    }
}