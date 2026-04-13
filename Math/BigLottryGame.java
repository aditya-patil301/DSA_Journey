import java.util.Scanner;

public class BigLottryGame{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lottry number: ");
        int n = sc.nextInt();

        if(n >= 300 && n <= 460){
            System.out.println("Congrats! You won MacBook.");
            if(n >= 300 && n <= 380){
                System.out.println("Model: M1 MacBook.");
            } else if(n >= 381 && n <= 460){
                System.out.println("Model: M2 MacBook.");
            }
        } else if(n >= 200 && n <= 280){
            System.out.println("Congrats! You won Kurkure.");
            if(n >= 200 && n <= 240){
                System.out.println("Flavour: Chilli Flavour.");
            } else if(n >= 241 && n <= 280){
                System.out.println("Flavour: Onion Flavour.");
            }
        } else if(n >= 1100 && n <= 1500){
            System.out.println("Congrats! You won Cycle.");
            if(n >= 1100 && n <= 1300){
                System.out.println("Brand: Avon Cycle.");
            } else if(n >= 1301 && n <= 1500){
                System.out.println("Brand: Hero Cycle.");
            }
        } else if(n > 50 && n <= 80){
            System.out.println("Congrats! You won Bike.");
            if(n >= 50 && n <= 65){
                System.out.println("Model: Bullet Bike.");
            } else if(n >= 65 && n <= 80){
                System.out.println("Model: Rajdoot Bike.");
            }
        } else {
            System.out.println("Better Luck Next Time.");
        }

        sc.close();

    }
}