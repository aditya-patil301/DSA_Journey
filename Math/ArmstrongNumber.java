import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int lastDigit = 0;
        int n = 0;
        double sum = 0;

        while(num > 0){
            num /= 10;
            n++;
        }

        num = originalNum;

        while(num > 0){
            lastDigit = num % 10;
            sum = sum + (Math.pow(lastDigit, n));
            num = num / 10;
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is a Amstrong Number.");
        } else {
            System.out.println(originalNum + " is not a Amstrong Number.");
        }
    }
}
