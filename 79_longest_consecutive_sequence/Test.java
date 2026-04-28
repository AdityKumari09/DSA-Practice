import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        System.out.print("The length of longest consecutive array is :- " + longest_consecutive_array(arr));

        sc.close();
    }

    public static int longest_consecutive_array(int[] arr)
    {
        int max_length = 0;

        Set<Integer> set = new HashSet<>();

        for (int nums : arr)
        {
            set.add(nums);
        }

        for (int nums : set)
        {
            if(!set.contains(nums - 1))
            {
                int current = nums;
                int count = 1;

                while (set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                max_length = Math.max(count, max_length);
            }

        }

        return max_length;
    }
}

/*
    Given an unsorted array of integers nums, return the length of the longest 
    consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.

    Example 1:
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
    Therefore its length is 4.
*/