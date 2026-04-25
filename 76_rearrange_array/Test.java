import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter equal no. of positive and negative:- ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array after rearrangement is :- ");
        int[] result = rearrange_array(arr);

        for (int nums : result)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static int[] rearrange_array(int[] arr)
    {
        int[] ans = new int[arr.length];
        int pos_index = 0;
        int neg_index = 1;

        for (int i  = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                ans[neg_index] = arr[i];
                neg_index += 2;
            }

            else
            {
                ans[pos_index] = arr[i];
                pos_index += 2;
            }
        }

        return ans;
    }
}

/*
    Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of 
    positive and negative elements. Without altering the relative order of 
    positive and negative elements, you must return an array of alternately 
    positive and negative values.

    Example 1:
    Input:
    arr[] = {1,2,-4,-5}, N = 4
    Output:
    1 -4 2 -5
    Explanation: 
    Positive elements = 1,2
    Negative elements = -4,-5
    To maintain relative order, 1 must occur before 2, and -4 occur before -5.
*/
