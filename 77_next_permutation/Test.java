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

        next_permutation(arr);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static void next_permutation(int[] arr)
    {
        int n = arr.length;
        int index = -1; // index of break point.
        for (int i = n - 2; i >= 0; i--)
        {
            if (arr[i] < arr[i + 1]) // this will be the break point.
            {
                index = i;
                break;
            }
        }

        if (index == -1)
        {
            reverse(arr, 0, n -1);
            return;
        }

        for (int i = n - 1; i > index; i--)
        {
            if (arr[i] > arr[index])
            {
                swap(arr, i, index);
                break;
            }
        }

        reverse(arr, index + 1, n - 1);

    }

    public static void reverse(int[] arr, int i, int j)
    {
        while (i < j)
        {
            swap(arr, i, j);
            i++;
            j--;
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
    Problem Statement: Given an array Arr[] of integers, rearrange the numbers 
    of the array into the lexicographically next greater permutation of numbers.

    If such an arrangement is not possible, it must rearrange to the lowest 
    possible order (i.e., sorted in ascending order).

    Input: Arr[] = {1,3,2}
    Output: {2,1,3}
    Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , 
    {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is
    {2,1,3}.
*/