import java.util.Scanner;

public class Test {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        printReverse(n);

        sc.close();
    }    

    static void printReverse(int n)
    {
        if (n == 0)
        {
            return;
        }

        System.out.print(n + " ");

        printReverse(n - 1);
    }
}

/*
    Print N to 1 using Recursion
    Input: N = 4
    Output: 4, 3, 2, 1
*/


