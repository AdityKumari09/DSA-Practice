import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements :- ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        maxSubArray(arr);
    }

    public static void maxSubArray(int[] arr)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start_index = 0;
        int end_index = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (sum == 0)
            {
                tempStart = i;
            }

            sum += arr[i];

            if (sum > max)
            {
                max = sum;
                start_index = tempStart;
                end_index = i;
            }

            if (sum < 0)
            {
                sum = 0;
            }
        }

        System.out.print("Subarray with maximum sum is :- [");
        for (int i = start_index; i <= end_index; i++)
        {
            System.out.print(arr[i]);
            if (i < end_index)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Maximum Sum = " + max);
    }
}