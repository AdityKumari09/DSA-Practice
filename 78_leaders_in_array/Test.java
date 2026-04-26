import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

        List<Integer> list = leaders(arr);
        
        System.out.print(list);
    }

    public static List<Integer> leaders(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        int max_far = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (arr[i] > max_far)
            {
                list.add(arr[i]);
                max_far = arr[i];
            }
        }

        Collections.reverse(list);
        return list;
    }

}

/*
    Given an integer array nums, return a list of all the leaders in the array.

    A leader in an array is an element whose value is strictly greater than all 
    elements to its right in the given array. The rightmost element is always a 
    leader. The elements in the leader array must appear in the order they appear
    in the nums array.

    Example 1
    Input: nums = [1, 2, 5, 3, 1, 2]
    Output: [5, 3, 2]
    Explanation: 2 is the rightmost element, 3 is the largest element in the 
    index range [3, 5], 5 is the largest element in the index range [2, 5]
*/
