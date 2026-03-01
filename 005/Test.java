import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int temp1 = n;
        int temp2 = n;
        int digit = 0;
        int rev = 0;
        
        while (n != 0)
        {
            n = n / 10;
            digit++;
        }

        while (temp1 != 0)
        {
            rev += (int) Math.pow(temp1 % 10, digit);
            temp1 = temp1 / 10;
        }

        if (rev == temp2)
        {
            System.out.println(temp2+ " is an armstrong number");
        }
        else
        {
            System.out.println(temp2+ " is not an armstrong number");
        }

    }
}

/*
    Check if the Number is Armstrong

    Example 1

    Input: n = 153
    Output: true
    Explanation: Number of digits : 3.
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
    Therefore, it is an Armstrong number.
*/
