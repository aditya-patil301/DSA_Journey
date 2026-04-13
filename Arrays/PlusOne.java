import java.util.Scanner;

public class PlusOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = arr[i] + 1;
            if(arr[i] == 10 && i != 0){
                arr[i] = 0;
            } else{
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        String n = "";
        for(int i = 0; i < arr.length; i++){
            n = n + arr[i];
        }
        System.out.println(n);

        int[] ans = new int[n.length()];

        int k = 0;
        int count = 0;
        while(k < arr.length){
            if(arr[k] == 10){
                ans[count] = 1;
                count++;
                ans[count] = 0;
                count++;
                k++;
            } else {
                ans[count] = arr[k];
                count++;
                k++;
            }
        }

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}