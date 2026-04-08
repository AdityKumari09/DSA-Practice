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

        move_zeros(arr);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static void move_zeros(int[] arr)
    {
        int i = 0, j = 0;

        while (j < arr.length)
        {
            if (arr[j] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }

    //i = next position where non-zero should go and j = scanning pointer
}

/*
    Problem: You are given an array of integers, your task is to move all the 
    zeros in the array to the end of the array and move non-negative integers to
    the front by maintaining their order.

    Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
*/
