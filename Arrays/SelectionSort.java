import java.util.Scanner;

public class SelectionSort{
    public static void selectionSort(int[] arr){
        int temp;

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + i; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

        selectionSort(arr);

        sc.close();
    }
}