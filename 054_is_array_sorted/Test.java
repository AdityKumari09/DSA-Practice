import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Array is :- ");

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = false;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] < arr[i + 1])
            {
                isSorted = true;
            }

            else
            {
                System.out.print("Array is not sorted");
                break;
            }
        }

        if (isSorted == true)
        {
            System.out.print("Array is sorted.");
        }

        sc.close();
    }
}
