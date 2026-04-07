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

        System.out.print("Enter the point of rotation :- ");
        int k = sc.nextInt();

        rotate_array(arr, k);

        System.out.print("Rotated array will be :- ");

        for (int nums : arr)
        {
            System.out.print(nums + " ");
        }

        sc.close();
    }

    public static void rotate_array(int[] arr, int k)
    {
        k = k % arr.length;
        swap(arr, 0, k - 1);
        swap(arr, k, arr.length - 1);
        swap(arr, 0, arr.length - 1);
    }

    public static void swap(int[] arr, int i, int j)
    {
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

/*
    Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
    Output : [3, 4, 5, 6, 1, 2]
    Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
    rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
*/
