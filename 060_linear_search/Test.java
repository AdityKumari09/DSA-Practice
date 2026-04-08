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

        System.out.print("Enter the key:- ");
        int k = sc.nextInt();

        System.out.print(linear_search(arr, k));
    }    

    public static int linear_search(int[] arr, int k)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == k)
            {
                return i;
            }
        }

        return -1;
    }
}

/*
    Given an array, and an element num the task is to find if num is present in 
    the given array or not. If present print index of the element or print -1.
*/
