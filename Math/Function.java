import java.util.Scanner;

public class Function{

    /* Print Example
    public static void printName(String name){
        System.out.print("The user name is " + name + ".");
    } */

    /* Integer return
    public static int printSum(int a, int b){
        return a + b;
    } */

    public static float printAvg(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter forth number: ");
        int d = sc.nextInt();

        float avg = printSum(a, b, c, d);

        System.out.println("The sum of " + a + ", " + b + ", " + c + " and " + d + " is " + printAvg(a, b, c, d));
        System.out.println("The sum of " + a + ", " + b + ", " + c + " and " + d +  " is " + avg);

        sc.close();
    }
}














/* 
Functions in JAVA

SYNTAX -> 

public static returnType functionName(dataType argumentName_1, dataType argumentName_2){
    -- BODY OF A FUNCTION --
}

The number of arguments while defining and number of parameters while calling must be same otherwise it give error.

Return Type - 
            void - direct print
            int - for returning integer value
            boolean - returning true / false
            string - return string

*/
