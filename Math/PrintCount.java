import java.util.Scanner;

public class PrintCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to which you want to print: ");
        int num = sc.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while(i <= num){
            System.err.print(i + " ");
            i++;
        }

        sc.close();
    }
}
