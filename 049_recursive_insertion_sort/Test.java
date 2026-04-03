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

        recurisve_insertion_sort(arr, 0, n);

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static void recurisve_insertion_sort(int[] arr, int i, int n)
    {
        // n - 1 pass required
        if (i == n - 1)
        {
            return;
        }

        for (int j = i + 1; j > 0; j--)
        {
            if (arr[j] < arr[j -1])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

            else
            {
                break;
            }
        }

        recurisve_insertion_sort(arr, i + 1, n);
    }
}
