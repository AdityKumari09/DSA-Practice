import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        
        printNumber(1, n);
        sc.close();
    }

    static void printNumber(int count, int n)
    {
        if (count > n)
        {
            return;
        }

        System.out.print(count + " ");
        printNumber(count + 1, n);
    }
}

/*
    Print 1 to N using Recursion
    Input: N = 4
    Output: 1, 2, 3, 4
*/