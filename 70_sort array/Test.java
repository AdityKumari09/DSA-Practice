import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter only 0, 1 or 2 :- ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sort_array(arr);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static void sort_array(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;
        int current = 0;

        while (current <= j)
        {
            if (arr[current] == 0)
            {
                swap(arr, current, i);
                current++;
                i++;
            }

            else if (arr[current] == 1)
            {
                current++;
            }

            else
            {
                swap(arr, current, j);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
    Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort 
    the array in non-decreasing order. The sorting must be done in-place, 
    without making a copy of the original array.

    Input: nums = [1, 0, 2, 1, 0]
    Output: [0, 0, 1, 1, 2]
*/
