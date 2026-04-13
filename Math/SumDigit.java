import java.util.Scanner;

public class SumDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int lastDigit;
        int temp = num;

        while(temp != 0){
            lastDigit = temp % 10;
            sum += lastDigit;
            temp = temp / 10;
        }

        System.out.println("The sum of digits of " + num + " is " + sum + ".");

        sc.close();
    }
}