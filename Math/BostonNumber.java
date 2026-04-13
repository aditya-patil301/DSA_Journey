import java.util.*;
public class BostonNumber {

	public static void isBoston(int n){
		int originalNum = n;
		int lastDigit;
		int digitSum = 0; 

		while(n > 0){
			lastDigit = n % 10;
			digitSum = digitSum + lastDigit;
			n = n / 10;
		}

		n = originalNum;
		int factorSum = 0;

		int i = 2;
		while(n != 1){
			while(n % i == 0){
				factorSum = factorSum + i;
				n = n / i;
			}
			i++;
		}

		if(digitSum == factorSum){
			System.out.print("1");
		} else {
			System.out.print("0");
		}
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		isBoston(n);

		sc.close();

	// public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);

	// 	long n = sc.nextLong();
	// 	long lastDigit;
	// 	String result = "";
	// 	while(n > 0){
	// 		lastDigit = n % 10;
	// 		if(9 - lastDigit < lastDigit){
	// 			lastDigit = 9 - lastDigit;
	// 		}
	// 		result = lastDigit + result;
	// 		n = n / 10;
	// 	}

	// 	System.out.println(result);

	// 	sc.close();
    }
}