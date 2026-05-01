import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
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

        System.out.println("Matrix after rotation :- ");
        rotateImage(matrix);

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }

    public static void rotateImage(int[][] matrix)
    {
        int m = matrix.length;

        //transpose
        for (int i = 0; i < m; i++)
        {
            for (int j = i + 1; j < m; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for (int i = 0; i < m; i++)
        {
            int left = 0, right = m - 1;

            while (left < right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

}

/*
    Problem Statement: Given an N * N 2D integer matrix, rotate the matrix by 90
    degrees clockwise. The rotation must be done in place, meaning the input 2D 
    matrix must be modified directly.

    input :- 1 2 3      Output :- 7 4 1
             4 5 6                8 5 2
             7 8 9                9 6 3
     first we do transpose 1 4 7  then reverse every row 7 4 1
                           2 5 8                         8 5 2
                           3 6 9                         9 6 3
*/
