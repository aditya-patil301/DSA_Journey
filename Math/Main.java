//Pattern 6
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int mid = n / 2;

//         for(int i = 0; i < n; i++){
//             int count = i;
//             for(int j = 0; j < n - i - 1; j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < 2 * i + 1; j++){
//                 if(j <= i){
//                     count++;
//                     System.out.print(count + " ");
//                 } else {
//                     count--;
//                     System.out.print(count + " ");
//                 }
//             }
//             System.out.println();
//         }

//         for(int i = n - 2; i >= 0; i--){
//             int count = i;
//             for(int j = 0; j < n - i - 1; j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < 2 * i + 1; j++){
//                 if(j <= i){
//                     count++;
//                     System.out.print(count + " ");
//                 } else {
//                     count--;
//                     System.out.print(count + " ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



//Pattern 7
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < i + 1; j++){
//                 int count = i + 1;
//                 if(j == 0 || j == i){
//                     System.out.print(count + "     ");
//                 } else{
//                     System.out.print("0     ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



//Pattern 8
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int firstTerm = 0;
//         int secondTerm = 1;
//         int thirdTerm = firstTerm + secondTerm;

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j <= i; j++){
//                 if(i == 0 && j == 0){
//                     System.out.print(firstTerm + "     ");
//                 } else if(i == 1 && j == 0){
//                     System.out.print(secondTerm + "     ");
//                 } else {
//                     System.out.print(thirdTerm + "     ");
//                     firstTerm = secondTerm;
//                     secondTerm = thirdTerm;
//                     thirdTerm = firstTerm + secondTerm;
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



//Pattern 9
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int mid = ((2 * n) + 1) / 2;

//         int count = n;

//         for(int i = n - 1; i >= 0; i--){
//             for(int j = 0; j < 2 * n + 1; j++){
//                 if(j < mid - i){
//                     System.out.print(count + " ");
//                     count--;
//                 } else if(j >= mid - i && j <= mid + i){
//                     System.out.print("  ");
//                 } else {
//                     count++;
//                     System.out.print(count + " ");
//                 }
//             }
//             count = n;
//             System.out.println();
//         }

//         for(int j = 0; j < 2 * n + 1; j++){
//             if(j <= mid){
//                 System.out.print(count + " ");
//                 if(count != 0){
//                     count--;
//                 }
//             }  else {
//                 count++;
//                 System.out.print(count + " ");
//             }   
//         }
//         System.out.println();

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < 2 * n + 1; j++){
//                 if(j < mid - i){
//                     System.out.print(count + " ");
//                     count--;
//                 } else if(j >= mid - i && j <= mid + i){
//                     System.out.print("  ");
//                 } else {
//                     count++;
//                     System.out.print(count + " ");
//                 }
//             }
//             count = n;
//             System.out.println();
//         }

//         sc.close();
//     }
// }






// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int mid = ((2 * n) - 1) / 2;

//         int count = 0;

//         for(int i = 0; i <= n / 2; i++){
//             for(int j = 0; j < mid - (2 * i); j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j <= i; j++){
//                 System.out.print("* ");
//             }

//             for(int j = 0; j < mid - (2 * i); j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < i + 1; j++){
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//         sc.close();
//     }
// }





// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int mid = ((2 * n) + 1) / 2;

//         for(int i = n; i >= 0; i--){
//             int count = i;
//             for(int j = 0; j < mid - i; j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < 2 * i + 1; j++){
//                 if(j <= ((2 * i) + 1)/2){
//                     System.out.print(count + " ");
//                     if(count != 0){
//                         count--;
//                     }
//                 } else {
//                     count++;
//                     System.out.print(count + " ");
//                 }
//             }
//             System.out.println();
//         }

//         for(int i = 1; i <= n; i++){
//             int count = i;
//             for(int j = 0; j < mid - i; j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < 2 * i + 1; j++){
//                 if(j <= ((2 * i) + 1)/2){
//                     System.out.print(count + " ");
//                     if(count != 0){
//                         count--;
//                     }
//                 } else {
//                     count++;
//                     System.out.print(count + " ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mid = ((2 * n) + 1) / 2;

        for(int i = 0; i <= n / 2; i++){
            int count = i + 1;
            for(int j = 0; j < (2 * n) + 1; j++){
                if(j < (mid - (2 * i)) - 1){
                    System.out.print("  ");
                } else if(j >= mid - (2 * i) && j <= mid - i){
                    System.out.print(count + " ");
                    count--;
                } else if(j > mid - i && j < mid + i){
                    System.out.print("  ");
                } else if(j >= mid + i && j <= mid + (2 * i)){
                    count++;
                    System.out.print(count + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = (n / 2) - 1; i >= 0; i--){
            int count = i + 1;
            for(int j = 0; j < (2 * n) + 1; j++){
                if(j < (mid - (2 * i)) - 1){
                    System.out.print("  ");
                } else if(j >= mid - (2 * i) && j <= mid - i){
                    System.out.print(count + " ");
                    count--;
                } else if(j > mid - i && j < mid + i){
                    System.out.print("  ");
                } else if(j >= mid + i && j <= mid + (2 * i)){
                    count++;
                    System.out.print(count + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int mid = ((2 * n) + 1) / 2;

//         for(int i = 0; i <= n / 2; i++){
//             int count = i + 1;
//             for(int j = 0; j < mid - (2 * i); j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < i + 1; j++){
//                 System.out.print("* ");
//             }

//             for(int j = 0; j < (2 * i) - 1; j++){
//                 System.out.print("  ");
//             }

//             for(int j = 0; j < i + 1; j++){
//                 System.out.print("* ");
//             }

//             for(int j = 0; j < mid - (2 * i); j++){
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

//         int mid = N / 2;

//         for (int i = 0; i < N; i++) {

//             // rowCount decide karega numbers kitne print honge
//             int rowCount = (i <= mid) ? i + 1 : N - i;

//             // outer spaces
//             int spaceOutside = (mid - rowCount + 1) * 4;
//             for (int s = 0; s < spaceOutside; s++) {
//                 System.out.print(" ");
//             }

//             // left part (descending)
//             for (int num = rowCount; num >= 1; num--) {
//                 System.out.print(num + " ");
//             }

//             // inner spaces (middle gap)
//             int spaceInside = (rowCount == 1) ? 0 : (rowCount * 2 - 3) * 4;
//             for (int s = 0; s < spaceInside; s++) {
//                 System.out.print(" ");
//             }

//             // right part (ascending)
//             if (rowCount != 1) {
//                 for (int num = 1; num <= rowCount; num++) {
//                     System.out.print(num + " ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }





