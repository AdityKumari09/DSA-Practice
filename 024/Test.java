import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            char ch = 'A';

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }

            ch -= 2;

            for (int j = 1; j < i; j++)
            {
                System.out.print(ch);
                ch--;
            }

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }   
}

/*
    
       A
      ABA
     ABCBA
    ABCDCBA
*/
