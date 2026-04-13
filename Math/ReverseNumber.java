import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int reversedNum = 0;
        int lastDigit;

        String reverse = "";

        while(temp != 0){
            lastDigit = temp % 10;
            reverse = reverse + lastDigit;
            reversedNum = (reversedNum * 10) + lastDigit;
            temp = temp/10;
        }

        System.out.println("The reverse number of " + num + " is " + reversedNum + ".");
        System.out.println("The reverse number of " + num + " is " + reverse + ".");

        sc.close();
    }
}