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

        int temp = arr[0];

        for (int i = 0; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;

        System.out.print("After rotating by 1 :- ");

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

}

/*
    Problem :- Given an integer array nums, rotate the array to the left by one
    Input:
    nums = [1, 2, 3, 4, 5]  
    Output:
    [2, 3, 4, 5, 1]  
*/
