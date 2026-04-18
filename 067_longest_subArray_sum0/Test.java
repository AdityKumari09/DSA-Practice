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

        System.out.print("Length of longest subarray with sum as 0 is :- " + 
            longestZeroSum(arr));
    }

    public static int longestZeroSum(int[] arr)
    {
        int sum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if (sum == 0)
            {
                maxLength = i + 1;
            }

            if (map.containsKey(sum))
            {
                int length = i - map.get(sum);
                maxLength = Math.max(length, maxLength);
            }

            if (!map.containsKey(sum))
            {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}

/*
    Problem statement :- Length of the longest subarray with zero Sum
    Given an arr containing both positive and negative integers, we have to find
    the length of longest subarray with the sum of all elements equal to zero.

    Example 1:
    
    Input:
    N = 6, array[] = {9, -3, 3, -1, 6, -5}  
    Result: 5

    Explanation:
    The following subarrays sum to zero:
    - {-3, 3}
    - {-1, 6, -5}
    - {-3, 3, -1, 6, -5}
    The length of the longest subarray with sum zero is 5.
*/
