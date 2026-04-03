import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        recursive_selection_sort(arr, 0, n);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }  

        sc.close();
    }

    public static void recursive_selection_sort(int[] arr, int i, int n)
    {
        if (i == n - 1)
        {
            return;
        }

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

        recursive_selection_sort(arr, i + 1, n);
    }
}
