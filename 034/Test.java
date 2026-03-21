
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        printFact(1, n);

        sc.close();
    }

    static void printFact(int fact, int n)
    {
        if (n == 0)
        {
            System.out.print(fact);
            return;
        }

        printFact(fact * n, n - 1);
    }
}

/*
    Problem Statement: Given a number X,  print its factorial.
    Input:
    X = 5
    Output: 120
    Explanation: 5! = 5*4*3*2*1
*/
