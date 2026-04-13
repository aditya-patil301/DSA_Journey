import java.util.Scanner;

public class Problem_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int l = 0;
        int r = arr.length - 1;

        int sereja = 0;
        int dima = 0;
        int flag = 0;

        while(l <= r){
            if(flag == 0){
                if(arr[l] >= arr[r]){
                    sereja += arr[l];
                    l++;
                    flag = 1;
                } else if(arr[l] <= arr[r]){
                    sereja += arr[r];
                    r--;
                    flag = 1;
                }
            }

            else if(flag == 1){
                if(arr[l] >= arr[r]){
                    dima += arr[l];
                    l++;
                    flag = 0;
                } else if(arr[l] <= arr[r]){
                    dima += arr[r];
                    r--;
                    flag = 0;
                }
            }
        }

        System.out.print(sereja + " " + dima);

        sc.close();
    }
}
