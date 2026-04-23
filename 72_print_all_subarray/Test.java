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

        System.out.println("All the sub array are :- ");
        subarray(arr);
    }

    public static void subarray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                int k = i;

                System.out.print("[");
                while (k <= j)
                {
                    System.out.print(arr[k]);
                    if (k < j)
                    {
                        System.out.print(", ");
                    }
                    k++;
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
