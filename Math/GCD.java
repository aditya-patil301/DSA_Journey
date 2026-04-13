// import java.util.Scanner;

// public class GCD{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int smaller;
//         int bigger;

//         if(a > b){
//             smaller = b;
//             bigger = a;
//         } else {
//             smaller = a;
//             bigger = b;
//         }

//         int remainder = smaller;
//         int result;
        
//         while(remainder != 0){
//             remainder = bigger % smaller;
//             if(remainder == 0){
//                 result = smaller;
//                 System.out.print("The GDC of " + a + " and " + b + " is " + result + ".");
//             } else {
//                 bigger = smaller;
//                 smaller = remainder;
//             }
//         }
//         sc.close();
//     }
// }



import java.util.Scanner;

public class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int GCD = 1;
        
        for(int i = 2; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                GCD = i;
            }
        }
        System.out.print("The GDC of " + a + " and " + b + " is " + GCD + ".");
        sc.close();
    }
}