import java.util.Scanner;

public class MaxElementArray{
    public static void maxElement(int[] arr){
        int largestElement = arr[0];

        // Time complexity - O(n), where n is the size of an array.

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }

        System.out.print("The largest element in an array is: " + largestElement);
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

        maxElement(arr);

        sc.close();
    }
}

// The return type of maxElement function can be int, if we write the return type of function int then we write return largestElement and in main function we use one variable largest and store the value by calling the function like int largest = maxElement(arr) and the we print the largest. 