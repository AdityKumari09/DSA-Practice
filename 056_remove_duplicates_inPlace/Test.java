import java.util.Scanner;

public class Test {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0; // last unique element index

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements (sorted):- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements:- " + k);

        System.out.print("Array after removing duplicates:- ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}