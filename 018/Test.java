import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                count = 1;
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(count + " ");

                if (count == 1)
                {
                    count = 0;
                }

                else {
                    count = 1;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/
