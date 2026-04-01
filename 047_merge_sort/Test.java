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

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array :- ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }   
    
    public static void mergeSort(int[] arr, int start, int end)
    {
        if (start >= end)
        {
            return;
        }
        else 
        {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end)
    {
        int[] temp = new int[end - start + 1]; //size of subarray

        int i = start; //pointer for left half
        int j = mid + 1; //pointer for right half
        int k = 0; // pointer for temporary array
            
        while (i <= mid && j <= end)
        {
            if (arr[i] < arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid)
            {
                temp[k++] = arr[i++];
            }

            while (j <= end)
            {
                temp[k++] = arr[j++];
            }

        for (int x = 0; x < temp.length; x++)
        {
            arr[start + x] = temp[x];
        }

    }

}
