import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            // spaces
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*n - 2*i - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
    *********
     *******
      *****
       ***
        *
*/
