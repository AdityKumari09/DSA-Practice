import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit :- ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0){
            count++;
            n = n / 10;
        }

        System.out.print("The number of digits are " + count);
    }
}

/*
    Problem Statement: Given an integer N, return the number of digits in N.

    Example 1:
    Input:N = 12345
    Output:5
    Explanation:  The number 12345 has 5 digits.
                            
    Example 2:
    Input:N = 7789              
    Output: 4
    Explanation: The number 7789 has 4 digits.  

 */
