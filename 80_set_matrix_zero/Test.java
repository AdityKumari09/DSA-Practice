import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int m = sc.nextInt();

        System.out.print("Enter the number of column :- ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix after setting zero :- ");
        setZeros(matrix);

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }

    public static void setZeros(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] == 0)
                {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (row[i] || column[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
/*
    Given an m x n integer matrix matrix, if an element is 0, set its entire row 
    and column to 0's.
    You must do it in place.

    Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
    Output: [[1,0,1],[0,0,0],[1,0,1]]
    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be
    set to 0.
*/