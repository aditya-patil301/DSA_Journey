import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage marks of student: ");
        float percentage = sc.nextFloat();

        // if(percentage <= 100 && percentage > 90){
        //     System.out.println("Grade: A");
        // } else if (percentage <= 90 && percentage > 80){
        //     System.out.println("Grade: B");
        // } else if (percentage <= 80 && percentage > 70){
        //     System.out.println("Grade: C");
        // } else if (percentage <= 70 && percentage > 60){
        //     System.out.println("Grade: D");
        // } else if (percentage <= 60 && percentage > 50){
        //     System.out.println("Grade: E");
        // } else {
        //     System.out.println("Grade: F");
        // }

        if(percentage <= 100 && percentage >= 91){
            System.out.println("Grade: A");
        } else if (percentage >= 81){
            System.out.println("Grade: B");
        } else if (percentage >= 71){
            System.out.println("Grade: C");
        } else if (percentage >= 61){
            System.out.println("Grade: D");
        } else if (percentage >= 51){
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
