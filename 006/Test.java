import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer :- ");
        int n = sc.nextInt();

        System.out.print("The divisors of " + n + " are :- ");

        // Step 1: Print small divisors
        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }

        // Step 2: Print large divisors in reverse
        for(int i = (int)Math.sqrt(n); i >= 1; i--)
        {
            if(n % i == 0)
            {
                if(i != n / i)   // avoid duplicate for perfect square
                {
                    System.out.print(n / i + " ");
                }
            }
        }

        sc.close();
    }
}

/*
    Problem Statement: Given an integer N, return all divisors of N.
    A divisor of an integer N is a positive integer that divides N without leaving 
    a remainder. In other words, if N is divisible by another integer without any 
    remainder, then that integer is considered a divisor of N.

    Examples
    Input: N = 36
    Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
    Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
    Input: N = 12
    Output: [1, 2, 3, 4, 6, 12]
    Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
*/
