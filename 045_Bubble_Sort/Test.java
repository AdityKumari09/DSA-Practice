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

        for (int i = 0; i < n; i++)
        {
            boolean swapped = false;
            // for each step max item will come at the last respective index
            for (int j = 1; j < n - i; j++)
            {
                if (arr[j] < arr[j - 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            /* 
                if no swapping is done for a particular value of i, it means arr
                is already sorted, then stop the loop
             */
            if (swapped == false)
            {
                break;
            }
        }

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }    
}
