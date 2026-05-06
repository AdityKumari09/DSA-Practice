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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        List<List<Integer>> ans = fourSum(arr, target);

        System.out.println("Quadruplets:");
        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }

        sc.close();
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {

        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {

                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        // skip duplicates (left)
                        while (left < right && arr[left] == arr[left + 1]) left++;

                        // skip duplicates (right)
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    }

                    else if (sum < target) {
                        left++;
                    }

                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}