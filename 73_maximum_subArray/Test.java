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

        System.out.print("The max subarray is :- " + maxSubArray(arr));
    }

/* 
    // this approach takes O(n^2) time complexity

    public static int maxSubArray(int[] arr)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }
*/

// Kadanes algorithm approach :-

    public static int maxSubArray(int[] arr)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if (sum > max)
            {
                max = sum;
            }

            if (sum < 0)
            {
                sum = 0;
            }
        }

        return max;
    }

}

/*
    Problem Statement: Given an integer array nums, find the subarray with the 
    largest sum and return the sum of the elements present in that subarray.

    Example 1:
    Input:
    nums = [2, 3, 5, -2, 7, -4]  
    Output:
    15  
    Explanation:
    The subarray from index 0 to index 4 has the largest sum = 15, which is the 
    maximum sum of any contiguous subarray.
*/
