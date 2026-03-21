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

        printReverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    static void printReverse(int[] arr, int i, int j)
    {

        if (i >= j)
        {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        printReverse(arr, i + 1, j - 1);

    }
}



/*
    Problem: You are given an array. The task is reverse the array and print it.
    Input: N = 5, arr[] = {5,4,3,2,1}
    Output: {1,2,3,4,5}
*/
