import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i); j++)
            {
                System.out.print(" ");
            }

            for (int j = i ; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
    1______1
    12____21
    123__321
    12344321

    In this problem firstly values are printed from 1 -> i, then spaces 
    no of space in each row = 2*(n - i) and then again values but from i -> 1
 
*/

