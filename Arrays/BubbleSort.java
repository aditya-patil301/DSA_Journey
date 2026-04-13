import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp;
        
        // for(int i = 0; i < arr.length - 1; i++){
        //     for(int j = 0; j < arr.length - i - 1; j++){
        //         if(arr[j] > arr[j + 1]){
        //             temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // int count = 0;
        // while(count < arr.length - 1){
        //     for(int i = 0; i < arr.length - count - 1; i++){
        //         if(arr[i] > arr[i + 1]){
        //             temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;
        //         }
        //     }
        //     count++;
        // }

        System.out.println("The elements of an array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        sc.close();
    }
}

/* We can also use this:
    arr[left] += arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--; */