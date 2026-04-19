import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target :- ");
        int target = sc.nextInt();

        int[] res = twoSum(arr, target);
        System.out.print("[" + res[0] + ", "+ res[1] + "]");
    }

    public static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            int current = arr[i];

            if (map.containsKey(target - current))
            {
                System.out.print("Yes found at :- ");
                return new int[]{map.get(target - current), i};
            }

            else
            {
                map.put(current, i);
            }
        }

        System.out.print("Not found ");
        return new int[]{-1, -1};
    }
}

/*
    Problem Statement: Given an array of integers arr[] and an integer target.

    1st variant: Return YES if there exist two no. such that their sum is equal 
    to the target. Otherwise, return NO.

    2nd variant: Return indices of the two no. such that their sum is equal to 
    the target. Otherwise, we will return {-1, -1}.

    EXAMPLE :-
    Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
    Output : YES
*/
