import java.util.Scanner;

public class Pattern_26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        int count;

        for(int i = 0; i < n; i++){
            count = i + 1;
            for(int j = 0; j < 2 * i + 1; j++){
                if(j % 2 != 0){
                    System.out.print("* ");
                } else{
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }

        for(int i = n - 2; i >= 0; i--){
            count = i + 1; 
            for(int j = 0; j < 2 * i + 1; j++){
                if(j % 2 != 0){
                    System.out.print("* ");
                } else{
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}