import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array:- ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array:- ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }
        
        ArrayList<Integer> union = find_union(arr1, arr2);

        System.out.print(union);

        sc.close();
    }

    public static ArrayList<Integer> find_union(int[] arr1, int[] arr2)
    {
        int i = 0;
        int j = 0;
        int current;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                current = arr1[i];
                i++;
            }

            else if (arr1[i] > arr2[j])
            {
                current = arr2[j];
                j++;
            }

            else
            {
                current = arr1[i];
                i++;
                j++;
            }

            if(union.size() == 0 || union.get(union.size() - 1) != current)
            {
                union.add(current);
            }

        }

        while (i < arr1.length)
        {
           if(union.size() == 0 || union.get(union.size() -1) != arr1[i])
            {
                union.add(arr1[i]);
            } 
            i++;
        }

        while (j < arr2.length)
        {
            if(union.size() == 0 || union.get(union.size() -1) != arr2[j])
            {
                union.add(arr2[j]);
            } 
            j++;
        }

        return union;
    }
}

