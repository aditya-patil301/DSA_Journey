import java.util.Scanner;

public class ReverseKElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int temp;
        int right = arrr.length() - 1;

        int count = 0;
        while(count < k){
            
        }

        sc.close();
    }
}

/* We can also use this:
    arr[left] += arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--; */