import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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