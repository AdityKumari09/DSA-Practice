import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n - 2; i++)
        {
            System.out.print("*");

            for (int j = 0; j < n - 2; j++)
            {
                System.out.print(" ");
            }

            System.out.print("*");
            
            System.out.println();
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print("*");
        }

        sc.close();
    }
}

/*
    ****
    *  *
    *  *
    ****
*/
