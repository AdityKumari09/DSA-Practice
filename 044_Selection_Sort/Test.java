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

        for (int i = 0; i < n - 1; i++)
        {
            int min_index = i;

            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int num : arr)
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

/*
    the outer loop (i) selects the position to be filled, the inner loop (j) 
    searches for the smallest element in the remaining array, and then that 
    element is swapped with the current position.
*/
