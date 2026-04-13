import java.util.*;

public class LinearSearch{
    public static boolean linearSearch(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
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

        System.out.println(linearSearch(arr, target));
        sc.close();
    }
}