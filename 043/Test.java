import java.util.HashMap;
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

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
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

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        for (int key: map.keySet())
        {
            int freq = map.get(key);

            if (freq > maxFreq)
            {
                maxFreq = freq;
                maxElement = key;
            }

            if (freq < minFreq)
            {
                minFreq = freq;
                minElement = key;
            }
        }

        System.out.println(maxElement + " " + minElement);

        sc.close();
    }
}
