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

        System.out.print("Enter the value of k :- ");
        int k = sc.nextInt();

        System.out.print("Count of subarray equals sum k is :- " + subarraySumEqualsK(arr, k));

        sc.close();
    }

    public static int subarraySumEqualsK(int[] arr, int k)
    {
        int count = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            
            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];

                if (sum == k)
                {
                    count++;
                }
            }
        }

        return count;
    }

    /*
        Given an array of integers nums nd an integer k, return the total number
        of subarrays whose sum equals to k.

       Example 1:
            Input: nums = [1,1,1], k = 2
            Output: 2 

    */
}
