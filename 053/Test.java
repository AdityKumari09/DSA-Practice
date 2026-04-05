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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                second_largest = max;
                max = arr[i];
            }

            else if (arr[i] > second_largest && arr[i] < max)
            {
                second_largest = arr[i];
            }

            if (arr[i] < min)
            {
                second_smallest = min;
                min = arr[i];
            }

            else if (arr[i] < second_smallest && arr[i] > min)
            {
                second_smallest = arr[i];
            }
        }

        /*
            For each element, if it’s greater than max, we update both max and 
            second max. 
            Otherwise, if it lies between max and second max, we update second 
            max. Same logic applies for minimum
        */

        /* 
            for (int i = 0; i < n; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }

                if (arr[i] < min)
                {
                    min = arr[i];
                }

            }

            for (int i = 0; i < n; i++)
            {
                if (arr[i] > second_largest && arr[i] < max)
                {
                    second_largest = arr[i];
                }

                if (arr[i] < second_smallest && arr[i] > min)
                {
                    second_smallest = arr[i];
                }
            }
        */

        if (second_largest == Integer.MIN_VALUE)
        {
            second_largest = -1;
        }

        if (second_smallest == Integer.MAX_VALUE)
        {
            second_smallest = -1;
        }

        System.out.print(second_largest + " " + second_smallest);
    }
}

/*
    Problem: Given an array, find the second smallest and second largest element
    in the array. Print ‘-1’ in the event that either of them doesn’t exist.

    Input:
    [1, 2, 4, 7, 7, 5]  
    Output:
    Second Smallest : 2  
    Second Largest : 5  
*/
