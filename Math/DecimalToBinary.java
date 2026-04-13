import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int originalNum = n;

        String result = "";
        int remainder = 0;

        while(n > 0){
            remainder = n % 2;
            result = remainder + result;
            n = n / 2;
        }

        System.out.print("The binary number of " + originalNum + " is " + result + ".");
    }
}