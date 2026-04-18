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

        System.out.print("max no. of ones are: " + findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int last_maxCount = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                count += 1;
            }

            if (arr[i] == 0)
            {
                count = 0;
            }

            last_maxCount = Math.max(last_maxCount, count);
        }

        return last_maxCount;
    }
}

/*
    Problem Statement: Given an array that contains only 1 and 0 return the 
                       count of maximum consecutive ones in the array..
    Example 1:
    Input: prices = {1, 1, 0, 1, 1, 1}
    Output: 3
*/