import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns :- ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = (spiralOrder(matrix));
        System.out.println(ans);

        sc.close();
    }

    public static List<Integer> spiralOrder(int[][] matrix)
    {
        int r = matrix.length;
        int c = matrix[0].length;

        int startRow = 0, endRow = r - 1;
        int startCol = 0, endCol = c - 1;

        List<Integer> ans = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol)
        {
            // top col
            for (int j = startCol; j <= endCol; j++)
            {
                ans.add(matrix[startRow][j]);
            }

            //right row
            for (int i = startRow + 1; i <= endRow; i++)
            {
                ans.add(matrix[i][endCol]);
            }

            //bottom col 
            for (int j = endCol - 1; j >= startCol; j--)
            {
                if (startRow == endRow)
                {
                    break;
                }
                ans.add(matrix[endRow][j]);
            }

            //left row
            for (int i = endRow - 1; i > startRow; i--)
            {
                if (startCol == endCol)
                {
                    break;
                }
                ans.add(matrix[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return ans;
    }
}
