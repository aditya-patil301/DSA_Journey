import java.util.Scanner;

public class Problem_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
            
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int flag = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.print("HARD");
        } else{
            System.out.print("EASY");
        }

        sc.close();
    }
}
