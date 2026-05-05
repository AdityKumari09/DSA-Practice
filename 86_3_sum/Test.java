import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(arr);

        System.out.println("Triplets with sum 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

        sc.close();
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            // skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    left++;
                    right--;

                    // skip duplicates (left)
                    while (left < right && arr[left] == arr[left - 1]) left++;

                    // skip duplicates (right)
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return ans;
    }
}
