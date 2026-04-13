import java.util.Scanner;

// Syntax - dataType[] arrayName = new dataType[size];

public class AA_BasicsOfArray{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];       // Declaration of an array
        
        // Inserting an elements manually
        /* arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;               
        arr[3] = 8;
        arr[4] = 10; */

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}