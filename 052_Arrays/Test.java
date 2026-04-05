import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array :- ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }

            System.out.print(max + " is largest of all.");

            sc.close();
        }
    }
}

/*
    Problem: Given an array, we have to find the largest element in the array.

    Input:
    arr[] = {2, 5, 1, 3, 0}  
    Output: 5  
*/