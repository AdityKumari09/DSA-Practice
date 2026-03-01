import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers :- ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n2 != 0)
        {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        System.out.print("The GCD will be :- " + n1);

        // int gcd = 1;

        // for (int i = 2; i <= Math.min(n1, n2); i++)
        // {
        //     if (n1 % i == 0 && n2 % i == 0)
        //     {
        //         gcd = i;
        //     }
        // }

        // System.out.print("GCD of give numbers will be " + gcd);

    }
}

/*
    Given two integers N1 and N2, find their greatest common divisor.

    Example 1:
    Input: N1 = 9, N2 = 12

    Output: 3
    Explanation:
    Factors of 9: 1, 3, 9
    Factors of 12: 1, 2, 3, 4, 6, 12
    Common Factors: 1, 3
    Greatest common factor: 3 (GCD)

    Example 2:
    Input: N1 = 20, N2 = 15

    Output: 5
    Explanation:
    Factors of 20: 1, 2, 4, 5, 10, 20
    Factors of 15: 1, 3, 5, 15
    Common Factors: 1, 5
    Greatest common factor: 5 (GCD)
    
*/
