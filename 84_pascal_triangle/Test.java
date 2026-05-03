import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the row number :- ");
            int numRows = sc.nextInt();

            System.out.print("print the list for each row in pascal traingle :- ");

            List<List<Integer>> result = PascalTriangle(numRows);
            System.out.print(result);

        }
    }

    public static List<List<Integer>> PascalTriangle(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++){

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    row.add(1);
                }

                else
                {
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }

            result.add(row);
        }

        return result;
    }
}
