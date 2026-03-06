import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int count = 1;

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(count);
                count++;
            }

            System.out.println();
        }

        sc.close();
        
    }
}
/*
    12345
    1234
    123
    12
    1
*/
