import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the integer :- ");
        int k = sc.nextInt();

    }
}

/*
    Problem Statement: Given an array nums of size n and an integer k, find the 
    length of the longest sub-array that sums to k. If no such sub-array exists,
    return 0.

    Example 1:
    Input:
    nums = [10, 5, 2, 7, 1, 9], k = 15  
    Output:
    4  
    Explanation:
    The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a 
    length of 4. This sub-array starts at index 1 and ends at index 4, and the sum 
    of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this 
    sub-array is 4.
*/