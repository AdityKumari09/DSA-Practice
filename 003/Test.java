import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit :- ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        if (n < 0)
        {
            System.out.println("Negative number will never be in palindrome");
        }

        else {
            while (n != 0)
            {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }

            if (temp == rev)
            {
                System.out.println("The reverse of " + temp + " is " + rev + " and therefore it is palindrome");
            }
            else {
                System.out.println("The reverse of " + temp + " is " + rev + " and therefore it is not palindrome");   
            }
        }

    }
}

/*
    Problem Statement: Given an integer N, return true if it is a palindrome 
    else return false.

    Example 1:
    Input:N = 4554
    Output:Palindrome Number
    Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
                                            
    Example 2:
    Input:N = 7789          
    Output: Not Palindrome
    Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
            
 */

