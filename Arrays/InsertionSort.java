import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int temp;
        
        for(int i = 1; i < arr.length; i++){
            int k = i;
            while(k > 0 && arr[k - 1] > arr[k]){
                  temp = arr[k - 1];
                arr[k - 1] = arr[k];
                arr[k] = temp;
                k--;
            }
        }

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

        insertionSort(arr);

        sc.close();
    }
}

/* We can also use this:
    arr[left] += arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--; */