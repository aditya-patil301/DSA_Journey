import java.util.Scanner;

public class LottryGame{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lottry number: ");
        int n = sc.nextInt();

        if(n >= 300 && n <= 460){
            System.out.println("Congrats! You won MacBook.");
        } else if(n >= 200 && n <= 280){
            System.out.println("Congrats! You won KurKure.");
        } else if(n >= 1100 && n <= 1500){
            System.out.println("Congrats! You won Cycle.");
        } else if(n > 50 && n <= 150){
            System.out.println("Congrats! You won Bike.");
        } else {
            System.out.println("Better Luck Next Time.");
        }

        sc.close();

    }
}