import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k:- ");
        int k = sc.nextInt();

        System.out.print("length of longest subarray is :- " + longestSum(arr, k));
    }

    public static int longestSum(int[] arr, int k)
    {
        int sum = 0;
        int max_length = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if (sum == k)
            {
                max_length = i + 1;
            }

            if(map.containsKey(sum - k))
            {
                int previouIndex = map.get(sum - k);
                int length = i - previouIndex;
                max_length = Math.max(length, max_length);
            }

            if(!map.containsKey(sum))
            {
                map.put(sum, i);
            }

        }

        return max_length;
    }
}

/*
    problem statement :- Given an array of integers (positive + negative) and an
    integer k, find the length of the longest subarray whose sum is equal to k.

    arr = [1, 2, 3, -3, 4, -2, 2]
    k = 3
    output :- 4

    [1, 2] → sum = 3 (length 2)
    [3] → sum = 3 (length 1)
    [2, 3, -3, 1] → (example style thinking)

    Longest valid:
    [1, 2, 3, -3] → sum = 3 → length = 4 ✅


    diary :- october 15
*/