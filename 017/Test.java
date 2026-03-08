import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        int high = (n + 1) / 2;
        int lower = n / 2;

        for (int i = 0; i < high; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }

            for (int j = 0; j < high - i - 1; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = lower - 1; i >= 0; i--)
        {
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }

            for (int j = 0; j < high - i - 1; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
            sc.close();
    }
}

/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/
