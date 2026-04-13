import java.util.Scanner;

public class EvenNoPrinting{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number upto which you want to print even numbers: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}