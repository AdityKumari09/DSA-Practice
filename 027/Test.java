import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        int half = (n + 1) / 2;

        for (int i = 1; i <= half; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (half - i); j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = half - 1; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (half - i); j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
    *        *
    **      ** 
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
*/