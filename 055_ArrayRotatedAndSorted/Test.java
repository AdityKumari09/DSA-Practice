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

        System.out.print(check_if_sorted_roated(arr, n));

        sc.close();

    }   

    public static boolean check_if_sorted_roated(int[] arr, int n)
    {
        int break_point = 0;

        // for (int i = 0; i < n -1; i++)
        // {
        //     if (arr[i] > arr[i + 1])
        //     {
        //         break_point += 1;
        //     }
        // }

        // if (break_point == 0 || (break_point == 1 && arr[n - 1] <= arr[0]))
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > arr[(i + 1) % n])
            {
                break_point += 1;
            }
        }

        return break_point <= 1;
    }
}

/*
    1) In case of normal non rotated sorted array, there will be no break point
       but if the array is rotated there will be 1 bp and last element will be
       smaller than first element
       if the array is non sorted and in random order there will be 1bp or
       more than that....and if 1bp last element will be not smaller than first.

    2) In the previous case if break_point == 1 we manually check if the last
    element <= arr[0] but if we do modulo then for arr[n - 1] it will check by
    i + 1 = 4 + 1 = 5 and 5 % 5 = 0...means for first element if array size is 5
*/