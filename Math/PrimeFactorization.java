import java.util.Scanner;

public class PrimeFactorization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.print("The prime factor of " + num + " is: ");
        for(int i = 2; num > 1; i++){
            while(num % i == 0){
                System.out.print(i + " ");
                num = num / i;
            }
        }
        sc.close();
    }
}