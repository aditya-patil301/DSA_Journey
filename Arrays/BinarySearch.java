import java.util.*;

public class BinarySearch{
    public static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){
            mid = (right + left) / 2;

            if(arr[mid] == target){
                return true;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else if(target < arr[mid]){
                right = mid - 1;
            } 
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, target));
        sc.close();
    }
}