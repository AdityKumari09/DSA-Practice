import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sixe of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        recursive_bubble_sort(arr, n);

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void recursive_bubble_sort(int[] arr, int n)
    {
        if (n == 1)
        {
            return;
        }

        boolean swapped = false;

        for (int j = 1; j < n; j++)
        {
            if (arr[j] < arr[j - 1])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                swapped = true;
            }
        }

        if (!swapped)
        {
            return;
        }

        recursive_bubble_sort(arr, n - 1);
    }
}
