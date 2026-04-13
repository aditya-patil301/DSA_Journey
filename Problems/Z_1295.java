import java.util.Scanner;

public class Z_1295{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < size; i++){
            String n = "";
            n += arr[i];
            if(n.length() % 2 == 0){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
} 