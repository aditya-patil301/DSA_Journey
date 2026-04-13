import java.util.Scanner;

public class Problem_189{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightSum = 0;
            for(int j = i + 1; j < arr.length; j++){
                rightSum = rightSum + arr[j];
                System.out.println("RightSum = " + rightSum);
                if(leftSum == rightSum){
                    System.out.println("i = " + i);
                }
            }
            leftSum = leftSum + arr[i];
            System.out.println("LeftSum = " + leftSum);
        }

        sc.close();
    }
}