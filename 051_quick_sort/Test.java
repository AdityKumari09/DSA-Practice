import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        quick_sort(arr, 0, n - 1);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }
    }

    public static void quick_sort(int[] arr, int low, int high)
    {
        if (low >= high)
        {
            return;
        }

        int partition_index = partition(arr, low, high);
        quick_sort(arr, low, partition_index);
        quick_sort(arr, partition_index + 1, high);
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j)
        {
            while (arr[i] <= pivot && i < high)
            {
                i++;
            }

            while (arr[j] > pivot && j > low)
            {
                j--;
            }

            if (i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    }
}
