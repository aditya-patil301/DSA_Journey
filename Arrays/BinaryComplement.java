import java.util.Scanner;

public class BinaryComplement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String bn = "";

        while(n != 0){
            int remainder = n % 2;
            n = n / 2;
            bn = remainder + bn;
        }

        int[] arr = new int[bn.length()];

        for(int i = 0; i < arr.length; i++){
            if(bn.charAt(i) == '1'){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(bn);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int j = 0;
        int cn = 0;

        for(int i = arr.length - 1; i >= 0; i--){
            cn = cn + (int)(arr[i] * (Math.pow(2, j)));
            j++;
        }

        System.out.println(cn);
        sc.close();
    }
}