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

        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += arr[i];
        }

        int expected_sum = ((n + 1) * (n + 2)) / 2;
        int missing = expected_sum - sum;

        System.out.print(missing);
    }
}

/*
    Problem :- Find the Missing Number
    Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
    Output: 6
    Explanation: All the numbers from 1 to 8 are present except 6.
*/

