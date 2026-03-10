import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }

        sc.close();
    }
}

/*
    A
    BB
    CCC
    DDDD
    EEEEE
*/
