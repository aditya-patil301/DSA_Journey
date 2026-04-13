import java.util.Scanner;

public class MaxMinElement{
    public static void maxElement(int[] arr){
        int largestElement = arr[0];
        int smallestElement = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
            if(arr[i] < smallestElement){
                smallestElement = arr[i];
            }
        }

        System.out.println("The largest element in an array is: " + largestElement);
        System.out.println("The smallest element in an array is: " + smallestElement);
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