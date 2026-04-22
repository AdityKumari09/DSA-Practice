import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the value with a majority element :- ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Majority element is " + majorityElement(arr));
    }

    public static int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);

                if (map.get(nums[i]) > nums.length / 2)
                {
                    return nums[i];
                }
            }

            else
            {
                map.put(nums[i], 1);
            }
        }

        return nums[0];
    }
}

/*
    Find the Majority Element that occurs more than N/2 times

    Problem Statement: Given an integer array of size n, return the majority 
                       element of the array.
    The majority element of an array is an element that appears more than n/2 
    times in the array. The array is guaranteed to have a majority element.

    Example 1:
    Input:
    nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
    Output:
    7  
    Explanation:
    The no 7 appears 5 times in the array, making it most frequent element.
*/
