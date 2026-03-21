import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        System.out.print("0 1 ");
        
        fibSeries(0, 1, n - 2);

        sc.close();
    }    

    static void fibSeries(int a, int b, int n)
    {
        if (n == 0)
        {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        fibSeries(b, c, n - 1);
    }
}

/*
    Problem: Given an integer N. Print the Fibonacci series up to the Nth term.
    Example 1:
    Input: N = 5
    Output: 0 1 1 2 3 5
    Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.
*/
