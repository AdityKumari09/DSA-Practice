import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit :- ");
        int n = sc.nextInt();
        int rev = 0;


        if (n > 0) {
            while (n > 0)
            {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
        }

        else {
            while (n < 0)
            {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
        }

        System.out.println("The reverse will be :- " + rev);

        sc.close();
    }
}

/*
    Problem Statement: Given an integer N return the reverse of the given number.
    Note: If a number has trailing zeros, then its reverse will not include them. 
    For e.g , reverse of 10400 will be 401 instead of 00401.

    Examples
    Input: N = 12345
    Output:54321
    Explanation: The reverse of 12345 is 54321.

    Input: N = 7789                
    Output: 9877
    Explanation: The reverse of number 7789 is 9877.
 */
