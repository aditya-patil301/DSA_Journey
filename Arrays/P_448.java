import java.util.*;

public class P_448{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        Set<Integer> checker = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            checker.add(nums[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){
            if(!checker.contains(i)){
                ans.add(i);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}