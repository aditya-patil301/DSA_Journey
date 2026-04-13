import java.util.Scanner;

public class SumOfNNaturalNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to which you want to print: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 0; i <= num; i++){
            sum = sum + i;
        }

        System.out.println("The sum of " + num + " is " + sum + ".");

        // int i = 0;
        // while(i <= num){
        //     sum = sum + i;
        //     i++;
        // }

        sc.close();
    }
}
