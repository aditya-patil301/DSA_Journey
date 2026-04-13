import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want in series: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = firstTerm + secondTerm;

        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");

        int i = 0;
        while(i < n - 2){
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.print(thirdTerm + " ");
            i++;
        }

        System.out.println();
        System.out.println("The term at " + n + " index in Fibonacci Series is: " + thirdTerm);
    }
}