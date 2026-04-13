import java.util.*;

public class P_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arr = {"flight", "flower", "flow"};

        Arrays.sort(arr);

        String x = arr[0];
        String y = arr[arr.length - 1];

        String ans = "";

        int i = 0;
        while(i < x.length() && i < y.length() && x.charAt(i) == y.charAt(i)){
            ans += x.charAt(i);
            i++;
        }

        System.out.print(ans);
    }
}

