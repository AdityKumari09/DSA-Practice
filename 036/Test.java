import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :- ");
        String s = sc.next();

        checkPalindrome(s, 0, s.length() - 1);

        sc.close();
    }

    static void checkPalindrome(String s, int i, int j)
    {
        if (i >= j)
        {
            System.out.print("Palindrome");
            return;
        }

        if (s.charAt(i) == s.charAt(j))
        {
            checkPalindrome(s, i + 1, j - 1);
        }

        else
        {
            System.out.print("Not palindrome");
            return;
        }
    }
}

/*
    Problem Statement: Given a string, check if the string is palindrome or not.
    A string is said to be palindrome if the reverse of the string is the same 
    as the string.

    Input: Str =  "ABCDCBA"
    Output: Palindrome
*/