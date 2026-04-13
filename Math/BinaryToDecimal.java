import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int num = sc.nextInt();

        int originalNum = num;

        int i = 0;
        int lastDigit = 0;
        double result = 0;
        while(num != 0){
            lastDigit = num % 10;
            result = result + (Math.pow(2, i) * lastDigit);          //result = result + (int)(Math.pow(2, i) * lastDigit);  --> TypeCasting
            num = num / 10;
            i++;
        }

        System.out.print("The decimal number of " + originalNum + " is " + result + ".");
        sc.close();
    }
}