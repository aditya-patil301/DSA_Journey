import java.util.Scanner;

public class Pattern_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an number: ");
        int n = sc.nextInt();

        int middle = n / 2;

        for(int i = 0; i < middle; i++){
            for(int j = 0; j < n ; j++){
                if(j <= middle + i && j >= middle - i){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }    

        System.out.println();

        for(int i = middle - 1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(j <= middle + i && j >= middle - i){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // for(int i = 0; i <= middle; i++){
        //     for(int j = 0; j < n / 2 - i ; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j = 0; j < 2 * i + 1; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j = 0; j < n / 2 - i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }   


        // for(int i = middle - 1; i >= 0; i--){
        //     for(int j = 0; j < n / 2 - i ; j++){
        //         System.out.print("* ");
        //     }

        //     for(int j = 0; j < 2 * i + 1; j++){
        //         System.out.print("  ");
        //     }

        //     for(int j = 0; j < n / 2 - i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
    }
}
