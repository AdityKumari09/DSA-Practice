import java.util.Scanner;

public class Test {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        printSum(0, n);

        sc.close();
    }    

    static void printSum(int sum, int n)
    {
        if (n == 0)
        {
            System.out.println(sum);  //final answer print
            return;
        }

        printSum(sum + n, n - 1);
    }
}

/*
    Problem : Given a number ‘N’, find the sum of the first N natural numbers .
    Input: N=5
    Output: 15
    Explanation: 1+2+3+4+5=15
*/
