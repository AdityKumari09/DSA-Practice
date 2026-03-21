import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name :- ");
        String s = sc.nextLine();

        printName(n, s);

        sc.close();
    }

        static void printName(int n, String s)
        {
            if (n == 0)
            {
                return;
            }

            System.out.print(s + " ");

            printName(n - 1, s);
        }

}

/*
    Print Name N times using Recursion
    Input: N = 3
    Output: Adity Adity Adity
*/

/*
    nextInt() reads only the integer value and leaves the newline character 
    ('\n') in the input buffer. When nextLine() is called after nextInt(), it 
    reads this leftover newline instead of waiting for new input, resulting in 
    an empty string. Therefore, an extra nextLine() is used to consume the 
    remaining newline before reading actual string input.
*/
