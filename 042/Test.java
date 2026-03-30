import java.util.HashMap;
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

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

            else
            {
                map.put(arr[i], 1);
            }
        }

        // ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        // for (int i = 0; i < keys.size(); i++)
        // {
        //     System.out.println(keys.get(i) + " -> " + map.get(keys.get(i)));
        // }

        for(int key : map.keySet()) 
        {
            System.out.println(key + " -> " + map.get(key));
        }
        sc.close();
    }
}

/*
    Problem : Given an array, we have found the number of occurrences of each 
    element in the array.

    Example 1:
    Input: arr[] = {10,5,10,15,10,5};
    Output: 10 -> 3
	        5 -> 2
            15 -> 1
*/
