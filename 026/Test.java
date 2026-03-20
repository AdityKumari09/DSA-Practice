import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        int half = n / 2;

        for (int i = 0; i < half; i++)
        {
            for (int j = 0; j < (n / 2) - i; j++)
            {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < (n / 2) - i; j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = 1; i <= half; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            for (int j = 0; j < n - (2 * i); j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}

/*
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
*/
