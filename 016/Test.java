import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        int upper = (n + 1) / 2;
        int lower = n / 2;

        // upper pyramid
        for(int i = 0; i < upper; i++)
        {
            for(int j = 0; j < upper - i - 1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i + 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower pyramid
        for(int i = lower - 1; i >= 0; i--)
        {
            for(int j = 0; j < upper - i - 1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i + 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
                *
               ***
              *****
             *******
            ********* 
            *********
             *******
              *****
               ***
                *

*/
